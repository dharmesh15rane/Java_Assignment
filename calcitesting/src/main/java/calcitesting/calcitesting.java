package calcitesting;

public class calcitesting {
     
	public Integer calculate(String i)
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
	public Integer calculate(int i , int j)
	{
		return i+j;
	}
}
