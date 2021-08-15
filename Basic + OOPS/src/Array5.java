  
public class Array5 {

		static void CountingEvenOdd(int arr[], int arr_size)
		{
			int even_count = 0;
			int odd_count = 0;

			for (int i = 0; i < arr_size; i++) {
				
				if ((arr[i] & 1) == 1)
					odd_count++;
				else
					even_count++;
			}

			System.out.println("Number of even"
							+ " elements = " + even_count
							+ " Number of odd elements = "
							+ odd_count);
		}

		public static void main(String[] args)
		{
			int arr[] = { 2, 3, 4, 5, 6 };
			int n = arr.length;
			
			CountingEvenOdd(arr, n);
		}
	}

