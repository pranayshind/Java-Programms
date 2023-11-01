package Basic_programms;
import java.util.Scanner;


public class Addition_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//binary input
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String b = in.nextLine();
		
		//binary to decimal conversion
		int n1 = Integer.parseInt(a,2);
		int n2 = Integer.parseInt(b,2);
		int sum = n1+n2;
		
		//converting decimal into binary
		String result = Integer.toBinaryString(sum);
		
		System.out.println(result);
		
		

	}

}
