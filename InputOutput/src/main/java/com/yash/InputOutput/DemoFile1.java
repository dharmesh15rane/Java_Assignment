package com.yash.InputOutput;
import java.io.*;
/**
 * Creating a class to copy content of one file into another file
 * 
 *
 */
public class DemoFile1
{
	public static void main(String[] args) throws IOException , FileNotFoundException
	{
		FileReader fin = new FileReader("C:\\Users\\ACER\\Documents\\workspace-spring-tool-suite-4-4.11.0.RELEASE\\InputOutput\\src\\main\\java\\com\\yash\\InputOutputFile1");
		FileWriter fout = new FileWriter("C:\\Users\\ACER\\Documents\\workspace-spring-tool-suite-4-4.11.0.RELEASE\\InputOutput\\src\\main\\java\\com\\yash\\InputOutputFile2", true);
		
		int i;
		while((i=fin.read()) !=-1)
		{
			fout.write(i);
		}
		
		System.out.println("File has copied!!");
		
		fin.close();
		fout.close();
	}

}
