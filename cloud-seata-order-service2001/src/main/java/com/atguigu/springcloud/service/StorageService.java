package com.atguigu.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.atguigu.springcloud.entities.CommonResult;

/** 
 * @author zhengcj
 * @Date 2020年10月15日 下午4:00:09
 * @version
 * @Description 
 *
 */
@Component
@FeignClient("seata-storage-service")
public interface StorageService {
	
	@PostMapping("/storage/decrease")
	public CommonResult decrease(@RequestParam("productId") Long productId,@RequestParam("count") Integer count);
}
