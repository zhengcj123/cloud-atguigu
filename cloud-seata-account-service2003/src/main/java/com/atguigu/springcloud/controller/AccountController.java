package com.atguigu.springcloud.controller;

import java.math.BigDecimal;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.service.AccountService;

import lombok.extern.slf4j.Slf4j;

/** 
 * @author zhengcj
 * @Date 2020年10月15日 下午9:52:14
 * @version
 * @Description 
 *
 */
@RestController
@Slf4j
public class AccountController {
	
	@Resource
	private AccountService accountService;
	@PostMapping("/account/decrease")
	public CommonResult decrease(Long userId,BigDecimal money) {
		int count = accountService.decrease(userId, money);
		log.info("account/decrease  "+count);
		if(count > 0) {
			return new CommonResult(200, "减少余额成功");
		}
		return new CommonResult(444, "减少余额失败");
	}

}
