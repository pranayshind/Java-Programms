package Basic_programms;
import java.util.Scanner;


public class Largest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if (a>b & a>c) {
			System.out.println(a+" is largest");
		}
		else if(b>a & b>c) {
			System.out.println(b+" is largest");
		}
		else {
			System.out.println(c+" is largest");
		}
		


	}

}
