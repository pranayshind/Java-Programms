package Programms_test;
import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		       Scanner in = new Scanner(System.in);
		        System.out.println("Enter number ");
		        int a = in.nextInt();
		        int b=0;
		        while(a>0){
		            int c = a%10;
		            b = b*10+c;
		            a = a/10;
		            
		        }            System.out.print(b);

	}

}
