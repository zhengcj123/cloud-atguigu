package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhengcj
 * @Date 2020年9月8日 下午2:51:08
 * @version
 * @Description
 *
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class ProviderPaymentController {

	@Value("${server.port}")
	private Integer serverPort;

	@GetMapping(value = "/nacos/{id}")
	public String getPayment(@PathVariable("id") Integer id) {
		log.info("nacos registry, serverPort: " + serverPort + "\t id" + id);
		return "nacos registry, serverPort: " + serverPort + "\t id" + id;
	}
}
