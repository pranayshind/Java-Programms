package programms;

import java.util.Scanner;

public class Count_even_odd {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			System.out.println("Enter size of array: ");
			int n = in.nextInt();
			int[] a = new int[n];

			System.out.println("Enter numbers: ");
			for(int i=0;i<n;i++) {
				a[i] = in.nextInt();
			}
		
			System.out.println("Even numbers in array: ");
			int even_count = 0;
			int odd_count=0;
			for(int i=0;i<n;i++) {
				if(a[i]%2==0) { 
					even_count+=1;
				}
				else {
					odd_count+=1;
				}
			}
			System.out.println("Even numbers are: "+even_count);
			System.out.println("odd numbers are: "+odd_count);

	}

}
