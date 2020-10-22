package com.atguigu.springcloud.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.service.StorageService;

/** 
 * @author zhengcj
 * @Date 2020年10月15日 下午8:43:38
 * @version
 * @Description 
 *
 */
@RestController
public class StorageController {

	@Resource
	private StorageService storageService;
	
	@PostMapping("/storage/decrease")
	public CommonResult decrease(Long productId,Integer count) {
		int num = storageService.decrease(productId, count);
		if(num > 0) {
			return new CommonResult(200, "减少存储成功");
		}
		return new CommonResult(444, "减少存储失败");
	}
}
