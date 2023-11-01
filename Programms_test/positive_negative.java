package Programms_test;
import java.util.Scanner;

public class positive_negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number: ");
		int a = in.nextInt();
		
		if(a>0) {
			System.out.println(a+" is positive number ");
		}
		else if(a<0) {
			System.out.println(a+" is negative number ");
		}
		else {
			System.out.println(a+ " is whole number ");
		}

	}

}
