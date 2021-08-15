package com.yash.ExceptionAssinment;

	import java.util.Scanner;

	public class Index 

	{
		public static void main(String args[])
		{
			String [] FirstName= {"Raju","Shyam", "Babu" ,"Kabira","Anjali","Anuradha","Pappu","Peter","NanJi","DeviPrasad"};
			String integer;
			try 
			{
				System.out.println("\t\t\t::::Enter the name 1 -- 10 for diplaying::::");	
				Scanner sc=new Scanner(System.in);
				integer=sc.nextLine();
				int i=Integer.parseInt(integer);
				i=i-1;
				System.out.println(FirstName[i]);
				sc.close();

			}
			catch(Exception e)
			{
				System.out.println("What going wrong:::\n" + e);
			}
		}

	}

