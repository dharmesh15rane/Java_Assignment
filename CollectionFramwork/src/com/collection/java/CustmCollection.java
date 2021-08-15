package com.collection.java;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.yash.collection.java.Customer;
import com.yash.collection.java.CustomerIdComparator;
import com.yash.collection.java.ProductQuantityComparator;


public class CustmCollection {
	 public static void main(String[] args)
	    {
		 List<Custmer> cust =new ArrayList();
		  Custmer c1 =new Custmer(101,"Dharmesh",50);
		  Custmer c2 =new Custmer(102,"Rane_Ji",29);
		  Custmer c3 =new Custmer(103,"Dharmesh",30);
		  Custmer c4 =new Custmer(104,"Dharm",31);
		  
		     cust.add(c1);
		     cust.add(c2);
		     cust.add(c3);
		     cust.set(2, c4);
		     cust.remove(0);
		     cust.add(c1);
		  Iterator<Custmer>  iterator=cust.iterator();
		  while( iterator.hasNext())
			 {
				 Custmer cust1 = (Custmer) iterator.next();
				cust1.showData(); 
			 }
				
			System.out.println("Sorted by Customer Id ");

//           Collections.sort(cust , new CustomerIdComparator());
//			for(Customer c: cust)
//				System.out.println(id+" " +name+ " " +quantity);
//			
//			System.out.println("Sorted by Product Quantity");
//
//			Collections.sort(cust , new ProductQuantityComparator());
//            
//			for(Customer c: cust)
//				System.out.println(id+" " +name+ " " +quantity);
//			  
	    }
}
