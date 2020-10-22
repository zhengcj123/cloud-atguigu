package com.atguigu.springcloud.serviceImpl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

import com.atguigu.springcloud.service.IMessageProvider;

/** 
 * @author zhengcj
 * @Date 2020年9月3日 下午10:06:19
 * @version
 * @Description 
 *
 */
@EnableBinding(Source.class)// 定义消息的推送管道
public class MessageProviderImpl implements IMessageProvider{

	@Autowired// 消息发送管道
	private MessageChannel output;
	
	@Override
	public String send() {
		String uuid = UUID.randomUUID().toString();
		Message<String> build = MessageBuilder.withPayload(uuid).build();
		boolean send = output.send(build);
		return (send?"发送成功":"发送失败") +uuid;
	}

}
