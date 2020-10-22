package com.atguigu.springcloud.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.atguigu.springcloud.dao.OrderDao;
import com.atguigu.springcloud.domain.Order;
import com.atguigu.springcloud.service.AccountService;
import com.atguigu.springcloud.service.OrderService;
import com.atguigu.springcloud.service.StorageService;

import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;

/** 
 * @author zhengcj
 * @Date 2020年10月10日 下午2:18:13
 * @version
 * @Description 
 *
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
	@Resource
	private OrderDao orderDao;
	@Resource
	private StorageService storageService;
	@Resource
	private AccountService accountService;
	
	@Override
	@GlobalTransactional(name="fsp-create-order",rollbackFor=Exception.class)
	public int create(Order order) {
		log.info("创建订单start");
		int count = orderDao.create(order);
		log.info("减库存");
		storageService.decrease(order.getProductId(), order.getCount());
		log.info("扣余额");
		accountService.decrease(order.getUserId(), order.getMoney());
		log.info("改订单状态");
		orderDao.update(order.getUserId(), 0);
		return count;
	}

}
