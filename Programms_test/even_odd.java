package Programms_test;
import java.util.Scanner;


public class even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number: ");
		int a = in.nextInt();
		
		if(a%2==0 && a!=0 && a>0) {
			System.out.println(a+" is even nnumber ");
		}
		else if(a%2!=0 && a>0) {
			System.out.println(a+ " is odd number ");
		}
		else if(a==0) {
			System.out.println(a+" is whole number ");
		}
		else {
			System.out.println(a+" is invalid number ");
		}
		

	}

}
