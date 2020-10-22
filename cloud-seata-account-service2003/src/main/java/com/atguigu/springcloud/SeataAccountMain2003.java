package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/** 
 * @author zhengcj
 * @Date 2020年10月15日 下午9:42:03
 * @version
 * @Description 
 *
 */
@EnableDiscoveryClient // 能够让注册中心能够发现，扫描到改服务
@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
public class SeataAccountMain2003 {
	public static void main(String[] args) {
		SpringApplication.run(SeataAccountMain2003.class, args);
	}
}
