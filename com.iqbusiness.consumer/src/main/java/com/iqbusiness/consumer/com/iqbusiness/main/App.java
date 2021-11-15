package com.iqbusiness.consumer.com.iqbusiness.main;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.iqbusiness.consumer.com.iqbusiness.impl.Consumer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Consumer consumer = new Consumer();
       
       try 
       {
		
    	   consumer.receiveMessage();
       } 
       catch 
       (IOException | TimeoutException e) 
       {
    	   // TODO Auto-generated catch block
    	   e.printStackTrace();
       }
   
    }
}
