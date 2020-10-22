package com.atguigu.springcloud.domain;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 
 * @author zhengcj
 * @Date 2020年10月15日 下午9:46:40
 * @version
 * @Description 
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Account {
	private Long id;
	private Long userId;
	private BigDecimal total;
	private BigDecimal used;
	private BigDecimal residue;
}
