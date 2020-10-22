package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhengcj
 * @Date 2020年9月8日 下午3:02:58
 * @version
 * @Description
 *
 */
@RestController
@RequestMapping("/consumer")
@Slf4j
public class NacosConsumerController {
	@Autowired
	private RestTemplate restTemplate;

	@Value("${service-url.nacos-user-service}")
	private String serverURL;

	@GetMapping(value = "/payment/nacos/{id}")
	public String paymentInfo(@PathVariable("id") Long id) {
		log.info(serverURL + "/payment/nacos/" + id);
		return restTemplate.getForObject(serverURL + "/payment/nacos/" + id, String.class);
	}
}
