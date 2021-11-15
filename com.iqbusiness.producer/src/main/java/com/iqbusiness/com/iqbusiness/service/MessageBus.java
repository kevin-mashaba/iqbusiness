package com.iqbusiness.com.iqbusiness.service;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;

public interface MessageBus {

	public abstract Channel createAndSendMessage(String message) throws IOException, TimeoutException;
}
