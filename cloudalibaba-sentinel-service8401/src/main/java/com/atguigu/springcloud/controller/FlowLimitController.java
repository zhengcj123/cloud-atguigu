package com.atguigu.springcloud.controller;

import java.util.concurrent.TimeUnit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;

import lombok.extern.slf4j.Slf4j;

/** 
 * @author zhengcj
 * @Date 2020年9月22日 上午9:43:29
 * @version
 * @Description 
 *
 */

@RestController
@RequestMapping("/sentinel")
@Slf4j
public class FlowLimitController {
    @GetMapping("/testA")
    public String testA() {
    	log.info(Thread.currentThread().getName()+"/t"+"testA");
//    	try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace();}
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB() {
        return "------testB";
    }
    
    @GetMapping("/testD")
    public String testD() {
    	log.info("====testD===");
//    	try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace();}
    	int i=10/0;
    	return "------testD";
    }
    
    @GetMapping("/testHotKey")
    @SentinelResource(value="aaa",blockHandler="delHotKeyException")
    public String testHotKey(@RequestParam(value="p1",required=false)String p1,String p2) {
    	log.info("------testHotKey---p1:"+p1+",p2:"+p2);
    	return "------testHotKey---p1:"+p1+",p2:"+p2;
    }
    
    public String delHotKeyException(@RequestParam(value="p1",required=false,defaultValue="hotkey")String p1,
    							String p2,BlockException exception) {
    	
    	return "------testHotKey---o(╥﹏╥)o";
    }
    
    



}