package com.wjx.active.produce;

import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Queue_Concumer {
	
	@JmsListener(destination = "${myqueue}")
	public void receive(TextMessage textMessage) throws JMSException {
		System.out.println("********** 接收消息" + textMessage.getText());
	}
	
}
