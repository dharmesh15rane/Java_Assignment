package com.yash.collection.java;
	import java.util.*;
	import java.util.Collections;
	/**
	 * Implementation of array list in main method
	 * 
	 *
	 */
	public class ArrayListCustomerApp
	{
		
		public static void main(String args[])
		{
			ArrayList<Customer> cs = new ArrayList<>();

			cs.add(new Customer(110, "Marsh", 9));
			cs.add(new Customer(107, "Jupiter", 7));
			cs.add(new Customer(115, "Dharmesh", 15));
			cs.add(new Customer(290, "Venus", 3));
			cs.add(new Customer(220, "Titan", 11));
			cs.add(new Customer(108, "Dharmesh", 9));
			cs.add(new Customer(180, "Anand", 2));

			for(Customer c: cs)
				System.out.println(c.customerId+"\t"+c.customerName+"\t"+c.productQuantity);
				
			System.out.println("Sorted by Customer Id ");

             Collections.sort(cs , new CustomerIdComparator());
			for(Customer c: cs)
				System.out.println(c.customerId+"\t"+c.customerName+"\t"+c.productQuantity);
			
			System.out.println("Sorted by Product Quantity");

			Collections.sort(cs , new ProductQuantityComparator());
              
			for(Customer c: cs)
				System.out.println(c.customerId+"\t"+c.customerName+"\t"+c.productQuantity);
		}

	}


