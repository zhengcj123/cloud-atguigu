package com.atguigu.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/** 
 * @author zhengcj
 * @Date 2020年10月15日 下午5:23:45
 * @version
 * @Description 
 *
 */
@Mapper
public interface StorageDao {
	
	public int decrease(@Param("count") Integer count,@Param("productId") Long productId);

}
