package String_;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Scanner in = new Scanner(System.in); System.out.println("Enter string: ");
		 * String s1 = in.nextLine(); int n = s1.length(); boolean palindrome = true;
		 * 
		 * 
		 * 
		 * for(int i=0;i<n;i++) { if(s1.charAt(i)!=s1.charAt(n-1-i)) { palindrome
		 * =false; } } if(palindrome) { System.out.println("Palindrome"); } else {
		 * System.out.println("Not Palindrome"); }
		 */
		
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s1 = in.nextLine();
		int n = s1.length();
		
		String pal = "";
		for(int i=n-1;i>=0;i--) {
			pal+= s1.charAt(i);
		}
		if(pal.equals(s1)) {
			System.out.println("pallindrome");
		}
		else {
			System.out.println("not pallindrome");
		}

	}

}
