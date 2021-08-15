package com.collection.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ItemCollection {
    public static void main(String[] args)
    {
    	List<Items> item = new ArrayList();
        Items i1 =new Items("Mung","Potato",234);
        Items i2 =new Items("Tuwar","Bhindi",234);
        Items i3 =new Items("Urat","Tomato",234);
        
        item.add(i1);
        item.add(i2);
        item.add(i3);
        System.out.println( item.get(0).getPulse());
       for(int i=0;i<item.size();i++) {
    	  // System.out.println(item.get(i).toString());
//        System.out.println( item.get(i).getVegitable());
//        System.out.println( item.get(i).getPulse());
    	   item.get(i).showData();
    	  
       }
       
        
    }
}
