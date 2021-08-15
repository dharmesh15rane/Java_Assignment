package com.yash.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import com.yash.collection.Shopping;
import com.yash.sorting.ProductIdComparator;
import com.yash.sorting.ProductNameComparator;
import com.yash.sorting.ProductPriceComprator;

public class ShoppingMain {

	public static void main(String[] args) {
		HashSet<Shopping> set =new HashSet<Shopping>();
		Shopping sp = new Shopping(131,"Mung", 75);
		Shopping sp1 = new Shopping(132,"Veg", 56);
		Shopping sp2 = new Shopping(133,"Coffee", 89);
		Shopping sp3 = new Shopping(134,"Tea", 60);
		Shopping sp4 = new Shopping(135,"Poha", 48);
		set.add(sp);
		set.add(sp1);
		set.add(sp2);
		set.add(sp3);
		set.add(sp4);
		//set.add(null);
		Iterator<Shopping> itr = set.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next().toString());
	}
	System.out.println("Size of Shopping_List => "+set.size());
	//new clone
	 HashSet cloned_set = new HashSet();
	 cloned_set =(HashSet)set.clone();
	 System.out.println("The new set:"+ cloned_set);
	 //Convert set into arraylist
	 List<Shopping> list =new ArrayList<Shopping>(set);
	 System.out.println("List"+list);
	 for (Iterator iterator = list.iterator(); iterator.hasNext();) {
		Shopping shopping = (Shopping) iterator.next();
		System.out.println(shopping);
	}
	 
	 System.out.println("Sorting by Product_Id");
	 
	Collections.sort(list,new ProductIdComparator());	
	 for(Shopping p : list) {
	 System.out.println(p.product_id+"\t"+p.product_name+"\t"+p.product_price);
      }
	 
     	System.out.println("Sorting by Product_Name");
     	
	Collections.sort(list,new ProductNameComparator());	
	 for(Shopping p : list) {
   	 System.out.println(p.product_id+"\t"+p.product_name+"\t"+p.product_price);
     }
	 
	System.out.println("Sorting by Product_Price");
	
	Collections.sort(list,new ProductPriceComprator());	
	   for(Shopping p : list) {
		System.out.println(p.product_id+"\t"+p.product_name+"\t"+p.product_price);
	
	 }
	   System.out.println("Fist Product");
	   System.out.println(list.get(0));
	   
	   System.out.println("Last Product");
	   System.out.println(list.get(list.size()-1));
  }
}

