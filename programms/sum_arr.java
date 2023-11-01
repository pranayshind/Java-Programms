package programms;

import java.util.Scanner;

public class sum_arr {

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
	
		int sum_ele = 0;
		int even_count = 0;
		int odd_count=0;
		for(int i=0;i<n;i++) {
			sum_ele+=a[i];
			if(a[i]%2==0) { 
				even_count+=a[i];
			}
			else  {
				odd_count+=a[i];
			}
			
		}
		
		System.out.println("sum of even elements are: "+even_count);
		System.out.println("sum of odd elements are: "+odd_count);
		System.out.println("sum all elements are: "+sum_ele);


	}

}
