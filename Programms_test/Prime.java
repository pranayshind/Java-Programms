package Programms_test;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("Enter number: ");
		int a = in.nextInt();
		int count=0;
		for(int i=2;i<=a/2;i++) {
			if(a%i==0){
				count+=1;
			}
		}if(count>0) {System.out.println("Given number is not prime number");}
		else {System.out.println("Given number is  prime number");}

	}

}
 