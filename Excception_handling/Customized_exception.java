package Excception_handling;

import java.util.Scanner;

class TooYoungException extends RuntimeException {
	TooYoungException(String n) {
		super(n);
		
	}
	
}



public class Customized_exception {
	

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = in.nextInt();
		

	
	
	if(age<18) {
		throw new TooYoungException("You are not eligiblt to vote");
	}
	else {
		System.out.println("you are eligible to vote");
	}

}
}
