import java.util.*;
public class array2 {
  public static void main(String[] args)
  {
	  Scanner sc = new Scanner(System.in);
      System.out.println("enter the size");
      int n  = sc.nextInt();
      int marks[] = new int[n];
      System.out.println("array length"+marks.length);
      System.out.println("enter"+n+"element");
      for(int i=0;i<marks.length;i++)
      {
    	  marks[i] = sc.nextInt();
      }
      int sum = 0;
      for(int i=0;i<marks.length;i++)
      {
    	  System.out.println(marks[i]);
    	  sum = sum +marks[i];
      }
      
  }
}
