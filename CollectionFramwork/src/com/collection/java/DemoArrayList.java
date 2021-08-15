package com.collection.java;
import java.util.*;
public class DemoArrayList {
   public static void main(String[] args) {
	   ArrayList arrayList = new ArrayList();
	   arrayList.add("hello");
	   arrayList.add("dharmesh");
	   arrayList.add(23);
	   arrayList.add("hii");
	   System.out.println(arrayList);
	   arrayList.add(0,79);
	   System.out.println(arrayList);
	   arrayList.set(4,"isaq");
	   System.out.println(arrayList);
	   System.out.println(arrayList.size());
	   System.out.println(arrayList.contains("dharmesh"));
	   // arrayList.removeRange(0,2);
	   System.out.println(arrayList.indexOf("dharmesh"));
	   System.out.println(arrayList.get(1));
	   System.out.println(arrayList.get(3));
//	   for(int i=0;i<arrayList.size();i++)
//	   {
//		   System.out.println(arrayList.get(i));
//	   }
	   System.out.println("Using Iterator");
	 Iterator u=arrayList.iterator();
	 while(u.hasNext())
	 {
		 Object object = (Object) u.next();
		 System.out.println(object);
		 
	 }
	  System.out.println("Using list Iterator using Forword");  
	 
	ListIterator  listIterator=arrayList.listIterator();
	   while(listIterator.hasNext()) {
		   Object type =listIterator.next();
		   System.out.println(type); 
	   }
	   System.out.println("Using list Iterator in Backword");
	   while(listIterator.hasPrevious()) {
		   Object type =listIterator.previous();
		   System.out.println(type); 
	   }
   }
}
                 