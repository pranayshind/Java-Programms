package Basic_programms;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Enter value of m and n: ");
		int m = in.nextInt();
		int n = in.nextInt();
		
		
		System.out.println("Before swaping "+m+" and "+n);
		
		int temp = m;
		m = n;
		n = temp;
		
		System.out.println("After swaping "+m+" and "+n);
		
		
		
		

	}

}
