package com.iqbusiness.consumer.com.iqbusiness.impl;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.iqbusiness.consumer.com.iqbusiness.service.MesaageBus;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

public class Consumer implements MesaageBus{

	@Override
	public Channel receiveMessage() throws IOException, TimeoutException {
		// TODO Auto-generated method stub
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.newConnection();
		
		Channel channel = connection.createChannel();
		
		DeliverCallback deliverCallback = (consumerTag,delivery) ->{
		
			String message = new String(delivery.getBody());
			
			if(message!=null)
			{
						
				System.out.println("Hello " + message + "," + " I'm your father!");
						
			}
			
		};
		
		channel.basicConsume("queue-1", true,deliverCallback,consumerTag ->{});
		
		return channel;
	}

	

}
