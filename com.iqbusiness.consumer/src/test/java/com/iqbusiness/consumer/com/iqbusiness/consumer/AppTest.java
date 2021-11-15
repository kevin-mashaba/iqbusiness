package com.iqbusiness.consumer.com.iqbusiness.consumer;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import com.rabbitmq.client.ConnectionFactory;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
	
	
	private ConnectionFactory connectionFactory;

	@Test
	public void testConnection()
	{
		
		System.out.println("Testing connection");
		
		
		Assert.assertNotNull(connectionFactory);		
		
	}
}
