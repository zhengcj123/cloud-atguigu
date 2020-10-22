package com.atguigu.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/** 
 * @author zhengcj
 * @Date 2020年10月10日 下午2:42:57
 * @version
 * @Description 
 *
 */

@Configuration
@MapperScan("com.atguigu.springcloud.dao")
public class MyBatisConfig {

}
