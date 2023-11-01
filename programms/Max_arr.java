package programms;

import java.util.Scanner;

public class Max_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = in.nextInt();
        int[] a = new int[n];
        System.out.println("enter elements: ");
        for(int i=0;i<n;i++) {
        	a[i] = in.nextInt();
         }
        
        int max = a[0];
        for(int i=0;i<n;i++) {
        	if(a[i]>max) {
        		max = a[i];
        	}
        }
        System.out.println("maximum element in array is "+ max);
        

	}

}
