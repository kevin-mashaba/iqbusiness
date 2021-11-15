package com.iqbusiness.com.iqbusiness.main;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeoutException;

import com.iqbusiness.com.iqbusiness.impl.Producer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Producer producer = new Producer();
        
        Scanner input =new Scanner(System.in);
        
        System.out.println("Enter name:");
        
        String message = input.nextLine();
        
        System.out.println("Hello my name is, " + message);
        
        
        try 
        {
			producer.createAndSendMessage(message);
			
		} 
        catch (IOException | TimeoutException e) 
        {
			
			e.printStackTrace();
		}
        
        input.close();
    }
}
