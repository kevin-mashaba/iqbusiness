package com.iqbusiness.consumer.com.iqbusiness.service;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;

public interface MesaageBus {

	public abstract Channel receiveMessage() throws IOException, TimeoutException;
	
}
