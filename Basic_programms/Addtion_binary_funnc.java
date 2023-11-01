package Basic_programms;

import java.util.Scanner;

public class Addtion_binary_funnc {
	static String add_Binary(String a, String b) {
		//binary to decimal conversion
		int n1 = Integer.parseInt(a,2);
		int n2 = Integer.parseInt(b,2);
		int sum = n1+n2;
		
		//converting decimal into binary
		String result = Integer.toBinaryString(sum);
		
		return result;
		
	}
	
	 public static void main(String args[]) {
		 Scanner in = new Scanner(System.in);
		 String a = in.nextLine();
		 String b = in.nextLine();
		 
		 System.out.println(add_Binary(a,b));
	 }

}
