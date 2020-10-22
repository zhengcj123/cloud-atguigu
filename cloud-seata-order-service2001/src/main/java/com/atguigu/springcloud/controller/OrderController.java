package com.atguigu.springcloud.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springcloud.domain.Order;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.service.OrderService;

/** 
 * @author zhengcj
 * @Date 2020年10月10日 下午2:20:18
 * @version
 * @Description 
 * 业务需求:下订单--》减库存--》扣余额--》改(订单)状态
 */
@RestController
@RequestMapping("/order")
public class OrderController {

	@Resource
	private OrderService orderService;
	
	@GetMapping("/create")
	public CommonResult create(Order order){
		int count = orderService.create(order);
		return new CommonResult<>(200, "创建订单成功");
		
	}
}
