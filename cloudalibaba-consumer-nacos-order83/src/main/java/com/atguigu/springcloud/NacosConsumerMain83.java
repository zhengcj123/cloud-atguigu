package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/** 
 * @author zhengcj
 * @Date 2020年9月8日 下午3:01:12
 * @version
 * @Description 
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConsumerMain83 {
	public static void main(String[] args) {
		SpringApplication.run(NacosConsumerMain83.class, args);
	}
}
