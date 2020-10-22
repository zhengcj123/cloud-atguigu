package com.atguigu.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.atguigu.springcloud.domain.Order;

/** 
 * @author zhengcj
 * @Date 2020年10月10日 下午2:13:46
 * @version
 * @Description 
 *
 */
@Mapper
public interface OrderDao {
    //新建订单
    int create(Order order);
    //修改订单状态，从零改为1
    int update(@Param("userId") Long userId,@Param("status") Integer status);

}
