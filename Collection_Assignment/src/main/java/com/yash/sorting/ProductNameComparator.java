package com.yash.sorting;
import java.util.Comparator;

import com.yash.collection.Shopping;
public class ProductNameComparator implements  Comparator<Shopping>{

	@Override
	public int compare(Shopping o1, Shopping o2) {
	    return o1.product_name.compareTo(o2.product_name);	
	}

}
;