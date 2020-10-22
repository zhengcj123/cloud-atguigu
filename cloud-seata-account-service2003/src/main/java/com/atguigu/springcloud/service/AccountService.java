package com.atguigu.springcloud.service;

import java.math.BigDecimal;

/** 
 * @author zhengcj
 * @Date 2020年10月15日 下午9:45:56
 * @version
 * @Description 
 *
 */
public interface AccountService {

	public int decrease(Long userId,BigDecimal money);
}
