package Excception_handling;

import java.util.Scanner;

class Rect_negative_dim_Exception extends Exception{
	@Override  //because we are overiding exception class methods
	public String toString() {
		return "dimensions cannot be negative";
	}
	@Override
	public String getMessage() {
		return "please check enterd dimensons";
	}
	
	

}
public class Customized_exception_Rect {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter length of rect: ");
		int a = in.nextInt();
		System.out.println("enter breadth of rect: ");
		int b= in.nextInt();
		
		if(a<0 || b<0) {
			try {
				throw new Rect_negative_dim_Exception();
			}
			catch(Exception e){
				
				System.out.println(e.toString());
				System.out.println(e.getMessage());
				e.printStackTrace();
				System.out.println("...programm finihed...");
			}
		
		}
		else {
			System.out.println("Area of rectangle is: "+a*b);
			}
		
	
		}

	}
