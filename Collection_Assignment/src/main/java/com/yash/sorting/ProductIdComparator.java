package com.yash.sorting;
import java.util.Comparator;

import com.yash.collection.Shopping;
public class ProductIdComparator implements Comparator<Shopping> {

	@Override
	public int compare(Shopping o1, Shopping o2) {
	 if(o1.product_id==o2.product_id)
		return 0;
	  else if(o1.product_id>o2.product_id)
	return 1;
	  else
	  return -1;
	  
	}

}

