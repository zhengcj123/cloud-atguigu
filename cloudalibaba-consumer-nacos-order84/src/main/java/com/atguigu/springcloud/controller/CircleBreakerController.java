package com.atguigu.springcloud.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.exception.MyExceptionHandler;
import com.atguigu.springcloud.service.PaymentService;

import lombok.extern.slf4j.Slf4j;

/**
 * 参考文档：https://blog.csdn.net/lzb348110175/article/details/107634024
 * @author zhengcj
 * @Date 2020年9月28日 下午2:58:28
 * @version
 * @Description
 *
 */
@RestController
public class CircleBreakerController {

	@Value("${service-url.nacos-user-service:http://nacos-payment-provider}")
	private String SERVICE_URL;

	@Resource
	private RestTemplate restTemplate;
	  
    @GetMapping("/consumer/fallback/{id}")
//    @SentinelResource(value = "fallback") //没有配置
//    @SentinelResource(value = "fallback",fallback = "handlerFallback") // fallback只负责业务异常
//    @SentinelResource(value = "fallback",fallbackClass=MyExceptionHandler.class,fallback="handlerFallback")
//    @SentinelResource(value = "fallbak", blockHandler = "blockException") // 只负责sentinel配置违规
//    @SentinelResource(value = "fallbak", blockHandlerClass= MyExceptionHandler.class, blockHandler = "blockException")
    @SentinelResource(value = "fallbak", fallbackClass=MyExceptionHandler.class,
    							fallback="handlerFallback", 
    							blockHandlerClass= MyExceptionHandler.class, 
    							blockHandler = "blockException")
    public CommonResult<Payment> fallback(@PathVariable Long id) {
        CommonResult<Payment> result = restTemplate.getForObject(SERVICE_URL + "/paymentSQL/"+id, CommonResult.class,id);
        if (id == 4) {
            throw new IllegalArgumentException ("IllegalArgumentException,非法参数异常....");
        }else if (result.getData() == null) {
            throw new NullPointerException ("NullPointerException,该ID没有对应记录,空指针异常");
        }
        return result;
    }
    
  
    //blockHandler
    public CommonResult blockException(/*@PathVariable */ Long id,BlockException e) {
    	Payment payment = new Payment(id,"null");
    	return new CommonResult<>(444,"兜底异常handlerFallback,exception内容  "+e.getMessage(),payment);
    }
    //fallback
    public CommonResult handlerFallback(@PathVariable  Long id,Throwable e) {
        Payment payment = new Payment(id,"null");
        return new CommonResult<>(444,"兜底异常handlerFallback,exception内容  "+e.getMessage(),payment);
    }
    
    //===========openFein===========
    @Resource
    private PaymentService paymentService;
    
    @GetMapping(value = "/consumer/paymentSQL/{id}")
	public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id) {
    	return paymentService.paymentSQL(id);
    }
}
