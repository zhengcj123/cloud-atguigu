package com.atguigu.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;

/** 
 * @author zhengcj
 * @Date 2020年9月24日 下午5:18:28
 * @version
 * @Description 
 *
 */
public class CustomBlockHandler {
	
	public static CommonResult exceptionHandler1(BlockException exception) {
		return new CommonResult(444,"---1--按用户自定义异常:"+exception.getMessage());
	}
	public static CommonResult exceptionHandler2(BlockException exception) {
		return new CommonResult(444,"---2--按用户自定义异常:"+exception.getMessage());
	}

}
