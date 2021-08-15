package com.yash.log4j;

import org.apache.log4j.Logger;

public class Demo1 {
 public static	Logger logg = Logger.getLogger(Demo1.class.getName());
 
 
 private static void add(int a, int d) {
	  int sum = a+d;
	  logg.info(sum);
    }
 
 
 public static void main(String[] args)
    {
    	int a =20;
    	int b= 0;
    	int d=30;
    	logg.warn("Hi Logger");
    	logg.info("hey we are calling divide()"+a +".."+b);
    	try
    	{
    	int c = a/b;
    	}
    	
    	catch(Exception e) 
    	{
    		logg.error(e.getMessage(),e);
    	}
    	
    	logg.debug("i am debug");
    	add(a,d);
    		
    }
	
}