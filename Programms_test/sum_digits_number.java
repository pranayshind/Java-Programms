package Programms_test;

import java.util.Scanner;

public class sum_digits_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("Enter number: ");
		int a = in.nextInt();
		int c= 0;
		
		while(a!=0) {
			int b = a%10;
			c += b;
			a=a/10;
		}
		System.out.println("sum of given number is : "+c);

	}

}
