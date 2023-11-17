package String_;

import java.util.Scanner;

public class v_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0, consonant;
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s1 = in.nextLine();
		
		int len = s1.length();
		
		for(int i=0;i<len;i++) {
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'||s1.charAt(i)=='A'||
					s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O'||s1.charAt(i)=='U') {
				count++;
				
			}
		}
		System.out.println("no. of vowels are ." +count);
		System.out.println("no. of consonant are "+(len-count));
			



	}

}
