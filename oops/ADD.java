//User-defined Method
//The method written by the user or programmer is known as a user-defined method. These methods are modified according to the requirement.

package oops;

import java.util.Scanner;

public class ADD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enetr 2 numbers");
		int a = in.nextInt();
		int b = in.nextInt();
		
		int c =addition(a,b);
		System.out.println("Addition is: "+c);
	}	
		
		
		
public static int addition(int a, int b) {
		int c;
		c = a+b;
		return c;
		
	}

	}


