package com.yash.InputOutput;
import java.util.Scanner;
import java.io.*;
public class DemoFile4 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner sc = new Scanner(new File("C:\\Users\\ACER\\Documents\\workspace-spring-tool-suite-4-4.11.0.RELEASE\\InputOutput\\src\\main\\java\\com\\yash\\InputOutputFile3"));
		Scanner s = new Scanner(System.in);
		
		while(sc.hasNextLine())
		{
			String name = s.nextLine();
			//String [] details = name.split(" ");
			
			System.out.println("Name: "+sc.next(name));
			//System.out.println("Address: "+details[1]);
			//System.out.println("Phone Number: "+details[2]);
		}
	}

}
