package com.yash.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import com.yash.collection.HealthCheckup;
import com.yash.collection.Shopping;

public class HealthMain {
           public static void main(String[]args)
           {
        	   HashSet<HealthCheckup> set =new HashSet<HealthCheckup>();
        	   HealthCheckup hc = new HealthCheckup(123,"Nobita", 21);
        	   HealthCheckup hc1 = new HealthCheckup(127,"Sinchan", 24);
        	   HealthCheckup hc2 = new HealthCheckup(139,"Dakesugi", 26);
        	   HealthCheckup hc3 = new HealthCheckup(133,"Sunio", 23);
        	
        	   set.add(hc);
        	   set.add(hc1);
        	   set.add(hc2);
        	   set.add(hc3);
        	  for (Iterator iterator = set.iterator(); iterator.hasNext();) {
				HealthCheckup healthCheckup = (HealthCheckup) iterator.next();
			   System.out.println(healthCheckup.toString());	
			}
        	  System.out.println("========================================");
        	  List<HealthCheckup> list =new ArrayList<HealthCheckup>(set); 
        	  for (Iterator iterator = list.iterator(); iterator.hasNext();) {
				HealthCheckup healthCheckup = (HealthCheckup) iterator.next();
				System.out.println(healthCheckup);	
			}
           System.out.println("Fist Product");
       	   System.out.println(list.get(0));
       	   
       	   System.out.println("Last Product");
       	   System.out.println(list.get(list.size()-1));
        	  
           }
}
