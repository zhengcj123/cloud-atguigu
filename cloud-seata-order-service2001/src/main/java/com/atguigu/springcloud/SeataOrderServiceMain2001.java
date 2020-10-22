package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/** 
 * @author zhengcj
 * @Date 2020年10月10日 下午2:04:25
 * @version
 * @Description 
 *
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)//取消数据源自动创建的配置
@EnableDiscoveryClient
@EnableFeignClients
public class SeataOrderServiceMain2001 {
	public static void main(String[] args) {
		SpringApplication.run(SeataOrderServiceMain2001.class, args);
	}
}
