package com.yash.InputOutput;
import java.io.*;
public class Demo1 {
	
		public static void main(String args[])
		{
			try
			{
				File f=new File("demo.txt");
				System.out.println("File name"+f.getName()+"File path"+f.getPath()+"File parent"+f.getParent());
				FileInputStream in=new FileInputStream(f);
				int i;
				while((i=in.read())!=1)
					System.out.println((char)i);
					FileReader f1=new FileReader(f);
					while((i=f1.read())!=-1)
					{
					System.out.println((char)i);	
					}
			}
			
			
			catch(Exception e)
			{
				System.out.println(e);
			}
		}

	}

