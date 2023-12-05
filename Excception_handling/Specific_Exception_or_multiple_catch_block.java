package Excception_handling;

import java.util.Scanner;

public class Specific_Exception_or_multiple_catch_block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		arr[0]=2;
		arr[1]=4;
		arr[2]=8;
		arr[3]=14;
		arr[4]=10;
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter index of numbder: ");
		int ind = in.nextInt();
		
		System.out.println("Enter number you want to divide by: ");
		int num = in.nextInt();
		
		try {
			System.out.println("number present at given index is: "+arr[ind]);
			
			System.out.println("answer we get by dividing:  "+arr[ind]/num);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occured");
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException occured");
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("some exception we got which is ");
			System.out.println(e);
		}

	}

}
