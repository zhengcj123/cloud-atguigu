package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;

/** 
 * @author zhengcj
 * @Date 2020年9月28日 下午9:45:23
 * @version
 * @Description 
 *
 */
@Component
public class PaymentFallbackService implements PaymentService{

	@Override
	public CommonResult<Payment> paymentSQL(Long id) {
		 return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
	}

}
