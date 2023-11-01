package Programms_test;
import java.util.Scanner;

public class sum_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enetr  starting number: ");
		int a = in.nextInt();
		System.out.println("Enetr  ending number: ");
		int b = in.nextInt();
		
		int even = 0;
		int odd = 0;
		
		for(int i=a; i<=b; i++) {
			if(i%2==0) {
				even = even + i;
				}
			else {
				odd = odd + i;
			}
		}
		
		System.out.println("even numbers sum is: "+ even);
		System.out.println("odd numbers sum is: "+ odd);
		
		
		

	}

}
