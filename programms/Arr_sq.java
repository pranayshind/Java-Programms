package programms;

import java.util.Scanner;

public class Arr_sq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
		
		System.out.println("enter no. of elements");
		int n = in.nextInt();
		
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
			
		}

		System.out.println("The sqaure of elements  are: ");
		
			
		int[] b = new int[n];
		for(int i=0;i<n;i++) {
			b[i]=a[i]*a[i];
			
		}
		for(int i=0;i<n;i++) {
			System.out.println(b[i]);

	}

	}
	
}
