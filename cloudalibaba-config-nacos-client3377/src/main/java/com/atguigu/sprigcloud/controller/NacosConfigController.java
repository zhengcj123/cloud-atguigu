package com.atguigu.sprigcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** 
 * @author zhengcj
 * @Date 2020年9月9日 下午2:49:20
 * @version
 * @Description 
 *
 */
@RestController
@RefreshScope
public class NacosConfigController {
	
	@Value("${config.info}")
	private String configInfo;
	
	@GetMapping("/config/info")
	public String getConfigInfo() {
		return configInfo;
	}
}
