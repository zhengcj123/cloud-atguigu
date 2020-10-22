package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/** 
 * @author zhengcj
 * @Date 2020年9月25日 上午9:23:48
 * @version
 * @Description 
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderPaymentMain9004 {
	public static void main(String[] args) {
		SpringApplication.run(ProviderPaymentMain9004.class, args);
	}
}
