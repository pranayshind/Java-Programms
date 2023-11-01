
package programms;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("enter no. of elements");
		int n = in.nextInt();
		
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
			
		}

		System.out.println("The elements  are: ");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
			
		}
	}

}
