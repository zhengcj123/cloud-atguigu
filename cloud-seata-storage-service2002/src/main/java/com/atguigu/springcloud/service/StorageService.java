package com.atguigu.springcloud.service;

/** 
 * @author zhengcj
 * @Date 2020年10月15日 下午4:00:09
 * @version
 * @Description 
 *
 */
public interface StorageService {
	
	public int decrease(Long productId,Integer count);
}
