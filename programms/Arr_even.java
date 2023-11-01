package programms;
import java.util.Scanner;

public class Arr_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = in.nextInt();
		int[] a = new int[n];

		System.out.println("Enter numbers: ");
		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
		}
	
		System.out.println("Even numbers in array: ");
		for(int i=0;i<n;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}

	}

}
