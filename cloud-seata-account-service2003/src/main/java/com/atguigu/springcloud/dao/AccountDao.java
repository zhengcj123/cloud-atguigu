package com.atguigu.springcloud.dao;

import java.math.BigDecimal;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/** 
 * @author zhengcj
 * @Date 2020年10月15日 下午9:45:16
 * @version
 * @Description 
 *
 */
@Mapper
public interface AccountDao {
	public int decrease(@Param("money") BigDecimal money,@Param("userId") Long userId);
}
