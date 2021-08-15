package com.yash.collection.java;
import java.util.Comparator;

	import java.util.*;
	public class ProductQuantityComparator implements Comparator<Customer>
	{

		@Override
		public int compare(Customer o1, Customer o2) 
		{
			if(o1.productQuantity==o2.productQuantity)
				return 0;
			else if(o1.productQuantity>o2.productQuantity)
				return 1;
			else 
				return -1;
		}
	}

