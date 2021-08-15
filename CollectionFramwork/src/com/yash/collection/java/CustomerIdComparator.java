package com.yash.collection.java;

import java.util.Comparator;

public class CustomerIdComparator  implements Comparator<Customer>
{ 
	@Override
	public int compare(Customer o1, Customer o2) 
	{
		if(o1.customerId==o2.customerId)
			return 0;
		else if(o1.customerId>o2.customerId)
			return 1;
		else 
			return -1;
	}
}
