package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/** 
 * @author zhengcj
 * @Date 2020年9月1日 下午8:43:21
 * @version
 * @Description 
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3355 {
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientMain3355.class, args);
	}

}
