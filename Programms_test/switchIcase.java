package Programms_test;
import java.util.Scanner;
public class switchIcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		    Scanner scanner = new Scanner(System.in);
		    System.out.print("Enter a character: ");
		    char character = scanner.next().charAt(0);
		    
		    switch (character) {
		      case 'a':
		      case 'e':
		      case 'i':
		      case 'o':
		      case 'u':
		        System.out.println("vowel");
		        break;
		      default:
		        System.out.println("consonant");
		    }
		  

	}

}
