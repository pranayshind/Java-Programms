package programms;
import java.util.Scanner;





public class Even_odd {
	
	public static void fun_even_odd(int n){
		if(n%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter number");
		int a = in.nextInt();
		
		fun_even_odd(a);
		
		
		

	}

}
