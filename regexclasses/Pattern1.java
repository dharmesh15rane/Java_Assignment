	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
public class Pattern1 {


		public static boolean outputCheck(String str)
		{
		String regex="^...9...4.....7....1....";
		Pattern p = Pattern.compile(regex);
		if(str == null)
		{
			return false;
		}
		
		Matcher m = p.matcher(str);
		
		return m.matches();
		
		
		}
		public static boolean outputCheck1(String str)
		{
		String regex="^one.two.three.four.five";
		Pattern p = Pattern.compile(regex);
		if(str == null)
		{
			return false;
			
		}
		
		Matcher m = p.matcher(str);
		
		return m.matches();
		
		
		}
		public static void main(String args[])
		{
		String str="one9two4three7four1five";
		outputCheck(str);
		System.out.println("9\n4\n7\n1");
		outputCheck1(str);
		System.out.println("one\ntwo\nthree\nfour\nfive\n");
		}
	}

