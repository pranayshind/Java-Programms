package Programms_test;
import java.util.Scanner;
public class Check_equal_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("Enter 2 number: ");
		int a = in.nextInt();
		int b = in.nextInt();
		
		if(a==b) {
			System.out.println("Equal numbers");
			
		}
		else{
			System.out.println("Not equal numbers");
			
		}
		

	}

}
