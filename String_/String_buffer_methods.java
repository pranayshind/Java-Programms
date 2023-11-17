
package String_;
import java.util.Scanner;
public class String_buffer_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		StringBuffer str = new StringBuffer("India");
		System.out.println("\n1.Length \n2.Capacity \n3.Setlength \n4.CharAt \n5.SetCharAt \n6.Append \n7.DeleteCharAt \n8.Substring \n9.Substring1  \n10.Insert \n11.Reverse");
		System.out.println("Enter a choice");
		int ch = in.nextInt();
		
		switch(ch) {
		case 1 :
			System.out.println("The length of string is  " + str.length());
		break;
		case 2 : 
			System.out.println("The capacity of string is  " + str.capacity());
		break;
		case 3 : 
			System.out.println("The set length of string is  " + str.length());
		break;
		case 4 : 
			System.out.println("The character at 5th position of is  " + str.charAt(4));
		break;
		case 5 : 
			str.setCharAt(2,'u');
			System.out.println("The string after setting positon is: "+ str);
		break;
		case 6 : 
			System.out.println("The string after appending is: "+ str.append(" Bharat"));
		break;
		case 7 : 
			System.out.println("The string after deleting character is: "+ str.deleteCharAt(2));
		break;
		case 8 : 
			System.out.println("The substring is: "+ str.substring(2));
		break;
		case 9 : 
			System.out.println("The substring is: "+ str.substring(2,4));
		break;
		case 10 : 
			System.out.println("The string after inserting is: "+ str.insert(1,"m"));
		break;
		case 11 : 
			System.out.println("The string after reversing is: "+ str.reverse());
		break;
		
	
		default:
			System.out.println("You have entereeed wrong choice ");
			break;
		
		}
		

	}

}
