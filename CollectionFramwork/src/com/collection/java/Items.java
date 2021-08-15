package com.collection.java;

public class Items {
      
	String pulses,vegitable;
	int bugdet;
	public Items(String pulses, String vegitable, int bugdet) {

		this.pulses = pulses;
		this.vegitable = vegitable;
		this.bugdet = bugdet;
	}
	public String toString()
	{
		return pulses+" "+ vegitable+" "+bugdet;
	}
//   public void setPulse(String pulses)
//   {
//	   this.pulses =pulses;
//   }
//   public void setVegitable(String vegitable)
//   {
//	   this.vegitable =vegitable;
//   }
//   public void setBudget(int budget)
//   {
//	   this.bugdet =budget;
//   }
	
    public String getPulse() {
        return pulses;
    }
    public String getVegitable() {
        return vegitable;
    }
    public int getBugdet() {
        return bugdet;
    }
    public void showData() 
    {
    	System.out.println(pulses+" " +vegitable+ " " +bugdet);
    }
 }
