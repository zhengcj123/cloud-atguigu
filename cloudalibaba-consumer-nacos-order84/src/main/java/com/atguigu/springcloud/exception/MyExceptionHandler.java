package com.atguigu.springcloud.exception;

import org.springframework.web.bind.annotation.PathVariable;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;

/** 
 * @author zhengcj
 * @Date 2020年9月28日 下午4:48:51
 * @version
 * @Description 
 *
 */
public class MyExceptionHandler {
	
	 //blockHandler
	public static CommonResult<Payment> blockException(Long id,BlockException e) {
    	Payment payment = new Payment(1L,"null");
    	return new CommonResult<>(444,"MyExceptionHandler blockException内容  "+e.getMessage(),payment);
    }
	
	 public static CommonResult handlerFallback(Long id,Throwable e) {
	        Payment payment = new Payment(id,"null");
	        return new CommonResult<>(555,"MyExceptionHandler handlerFallback,exception内容  "+e.getMessage(),payment);
	    }

}
