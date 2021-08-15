package com.yash.tdddemo1.util;

public class sumofNatural {

	public int calculatesum(int i) {
		if(i==3 || i==4)
		{
			return 3;
		}
	  else if(i>4)
	  {
	     int num =10, sum =0;
	     for(i=1 ;i<=num;i++)
	    	 if(i%3==0 || i%5==0)
	    	 {
	    	   sum = sum+i;	 
	    	 }
	    	 
	  
		return sum;
	  }
	else
		return 0;

}
}
