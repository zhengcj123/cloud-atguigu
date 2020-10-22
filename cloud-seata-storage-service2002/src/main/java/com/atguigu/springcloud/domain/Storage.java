package com.atguigu.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 
 * @author zhengcj
 * @Date 2020年10月15日 下午4:39:18
 * @version
 * @Description 
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Storage {
	private Long id;
	private Long productId;
	private Integer total;
	private Integer used;
	private Integer residue;
}
