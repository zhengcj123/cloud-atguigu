package com.atguigu.sprigcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/** 
 * @author zhengcj
 * @Date 2020年9月9日 下午2:47:16
 * @version
 * @Description 
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigMain3377 {
	public static void main(String[] args) {
		SpringApplication.run(NacosConfigMain3377.class, args);
	}

}
