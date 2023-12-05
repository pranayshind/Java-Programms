package Excception_handling;

import java.util.Scanner;

class MyException extends Exception{

	public String toString() {
		return" I am tostring";
	}

	public String getMessage() {
		return" Invalid number" ;
	}
}

public class Exception_methods_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =9;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number: ");
		int b = in.nextInt();
		if(b>a) {
			try {
				
				throw new MyException();
			}
			catch(MyException e){
				System.out.println(e.toString()); 
				System.out.println(e.getMessage());
				System.out.println(e);// return the same as tostring()
				e.printStackTrace();
				System.out.println("...programm finished...");
			}
		}
		
		 
		

	}

}
