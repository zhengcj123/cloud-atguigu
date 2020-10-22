package com.atguigu.springcloud.service;

import java.math.BigDecimal;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.atguigu.springcloud.entities.CommonResult;

/** 
 * @author zhengcj
 * @Date 2020年10月15日 下午4:00:38
 * @version
 * @Description 
 *
 */
@Component
@FeignClient("seata-account-service")
public interface AccountService {
	@PostMapping("/account/decrease")
	public CommonResult decrease(@RequestParam("userId") Long userId,@RequestParam("money") BigDecimal money);
}
