package Programms_test;

import java.util.Scanner;

public class vowel_consonant_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("Enter character: ");
		String a = in.next();
		
		if(a=="a" || a=="e" || a=="i" || a=="o" || a=="u" || a=="A"|| a=="E"|| a=="I"|| a=="O"||a=="U") {
			System.out.println("vowels");
			
		}
		else  {
			System.out.println("Consonant");
			
		}

	}

}
