package com.atguigu.springcloud.service.impl;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.atguigu.springcloud.dao.AccountDao;
import com.atguigu.springcloud.service.AccountService;

/** 
 * @author zhengcj
 * @Date 2020年10月15日 下午9:54:58
 * @version
 * @Description 
 *
 */
@Service
public class AccountServiceImpl implements AccountService {

	@Resource
	private AccountDao accountDao;
	@Override
	public int decrease(Long userId, BigDecimal money) {
		System.out.println("AccountServiceImpl-->decrease");
		try {
			TimeUnit.SECONDS.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return accountDao.decrease(money, userId);
	}

}
