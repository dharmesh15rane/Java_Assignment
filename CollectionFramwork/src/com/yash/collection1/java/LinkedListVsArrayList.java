package com.yash.collection1.java;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVsArrayList {
   
	public static void main(String[] args)
	{
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList =new LinkedList<Integer>();
		long startTime =System.nanoTime();
		for(int i=0;i<100000;i++)
		{
			arrayList.add(i);
		}
		long endTime =System.nanoTime();
	 System.out.println("ArrayList Add Time"+(endTime-startTime));
	 
	  startTime =System.nanoTime();
		for(int i=0;i<100000;i++)
		{
			linkedList.add(i);
		}
	   endTime =System.nanoTime();
	 System.out.println("LinkedList Add Time"+(endTime-startTime));
	}
}
