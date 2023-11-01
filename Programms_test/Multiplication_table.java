package Programms_test;

import java.util.Scanner;

public class Multiplication_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("Enter number: ");
		int a = in.nextInt();
		for(int i=1;i<=10;i++) {
			int table = a*i;
			System.out.println(a+"X"+i+"="+table);
		}

	}

}
