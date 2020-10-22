package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/** 
 * @author zhengcj
 * @Date 2020年9月22日 上午9:41:01
 * @version
 * @Description 
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelMain8401 {
	public static void main(String[] args) {
		SpringApplication.run(SentinelMain8401.class, args);
	}
}
