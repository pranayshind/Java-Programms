package Programms_test;
import java.util.Scanner;

public class swap_2_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stubt
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = in.nextInt();
		int b = in.nextInt();
		
		System.out.println("Numbers before swapping:" +a +" & " +b);
		
		int c = a;
		a = b;
		b = c;
		System.out.println("Numbers After swapping:" +a +" & " +b);
		
		
		

	}

}
