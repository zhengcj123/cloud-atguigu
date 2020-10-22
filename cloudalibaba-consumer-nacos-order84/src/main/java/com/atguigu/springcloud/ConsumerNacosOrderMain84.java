package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/** 
 * @author zhengcj
 * @Date 2020年9月25日 上午10:17:41
 * @version
 * @Description 
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients// 开启feign功能
public class ConsumerNacosOrderMain84 {
	public static void main(String[] args) {
		SpringApplication.run(ConsumerNacosOrderMain84.class, args);
	}

}
