package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/** 
 * @author zhengcj
 * @Date 2020年9月8日 下午2:49:34
 * @version
 * @Description 
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderPaymentMian9002 {
	public static void main(String[] args) {
		SpringApplication.run(ProviderPaymentMian9002.class, args);
	}
}
