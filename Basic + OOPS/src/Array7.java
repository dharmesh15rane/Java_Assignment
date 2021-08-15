import java.io.*;
public class Array7 {
	
		public static void main(String[] args)
		{
			int n = 4;
			String names[]= { "Sunil", "Bimla", "jacki", "Anwar" };
			String temp;
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (names[i].compareTo(names[j]) > 0) {
						temp = names[i];
						names[i] = names[j];
						names[j] = temp;
					}
				}
			}		
			System.out.println(
				"names in alphabetical order ");
			for (int i = 0; i < n; i++) {
				System.out.println(names[i]);
			}
		}
	}

	

