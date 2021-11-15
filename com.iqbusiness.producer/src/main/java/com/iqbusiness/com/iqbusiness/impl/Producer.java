package com.iqbusiness.com.iqbusiness.impl;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.iqbusiness.com.iqbusiness.service.MessageBus;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class Producer implements MessageBus{

	
	@Override
	public Channel createAndSendMessage(String message) throws IOException, TimeoutException {
		// TODO Auto-generated method stub
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.newConnection();
		Channel channel = connection.createChannel();
		
		channel.basicPublish("", "queue-1", null, message.getBytes() );
		
		channel.close();
		connection.close();
		
		return channel;
	}

	
	

}
