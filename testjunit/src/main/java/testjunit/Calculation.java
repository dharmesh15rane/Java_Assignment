package testjunit;

public class Calculation {

	public int add(int i , int j)
	{ 
		return i+j;
	}
	public Integer add(String i)
	{
		if(i=="")
		{
			return 0;
		}
		else {
			Integer j = Integer.parseInt(i);
			return j;
		}
	}	
	 
	public static void main(String[] args) {
 
		 

	}

}
