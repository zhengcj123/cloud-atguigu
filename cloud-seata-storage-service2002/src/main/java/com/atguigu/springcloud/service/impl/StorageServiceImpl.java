package com.atguigu.springcloud.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.atguigu.springcloud.dao.StorageDao;
import com.atguigu.springcloud.service.StorageService;

/** 
 * @author zhengcj
 * @Date 2020年10月15日 下午8:38:51
 * @version
 * @Description 
 *
 */
@Service
public class StorageServiceImpl implements StorageService {

	@Resource
	private StorageDao storageDao;
	
	@Override
	public int decrease(Long productId, Integer count) {
		return storageDao.decrease(count, productId);
	}

}
