package com.yash.ExceptionAssinment;

public class Demo1 {

		public static void main(String[] args)
		{
			doFun();
		}
	 static void doFun() {
		doStuff();
		doMoreFun();	
			
		}
	 private static void doStuff() {
	
	   System.out.println("Hello");	
	}
	static void doMoreFun() {
		System.out.println(10/0);
		
	}
		
	}

