package com.yash.InputOutput;
import java.io.*;
/**
 * Class for read the file and displaying data from file 
 * 
 *
 */
public class DemoFile2 
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		File f = new File("C:\\Users\\ACER\\Documents\\workspace-spring-tool-suite-4-4.11.0.RELEASE\\InputOutput\\src\\main\\java\\com\\yash\\InputOutput");
		
		FileInputStream fin = new FileInputStream(f);
		while(true)
		{
			int i = fin.read();
			if(i==-1)
				break;
			System.out.print((char)i);
		}
		
		fin.close();
	}

}
