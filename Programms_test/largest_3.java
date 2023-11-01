 package Programms_test;
 import java.util.Scanner;
 

public class largest_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Ente 3 numbers : ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a+" is greatest");
		}
		else if(b>a && b>c) {
			System.out.println(b+ " is greatest");
		}
		else {
			System.out.println(c+" is greatest");
		}
		

	}

}
