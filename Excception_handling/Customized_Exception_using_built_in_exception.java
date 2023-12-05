package Excception_handling;

import java.util.Scanner;


public class Customized_Exception_using_built_in_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =9;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number: ");
		int b = in.nextInt();
		if(b>a) {
			try {
				
				throw new Exception("I am exception");
			}
			catch(Exception e){
				System.out.println(e.toString()); 
				System.out.println(e.getMessage());
				System.out.println(e);// return the same as tostring()
				e.printStackTrace();
				System.out.println("...programm finished...");
			}
		}

	}

}
