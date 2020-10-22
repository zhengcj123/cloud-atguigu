package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/** 
 * @author zhengcj
 * @Date 2020年10月15日 下午4:34:30
 * @version
 * @Description 
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SeataStorageServiceMain2002 {
	public static void main(String[] args) {
		SpringApplication.run(SeataStorageServiceMain2002.class, args);
	}
}
