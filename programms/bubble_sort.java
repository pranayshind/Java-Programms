package programms;

import java.util.Scanner;

public class bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = in.nextInt();
        int[] a = new int[n];

        System.out.println("Enter numbers: ");
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        
        for(int i=0;i<n;i++) {
        	for(int j=i+1;j<n;j++) {
        		if(a[i]>a[j]) {
        			int temp = a[i];
        			a[i] = a[j];
        			a[j] = temp;
        			
        		}
        	}
        	
        }
        
        for(int i=0;i<n;i++) {
        	System.out.println(a[i]);
        }
        
        

	}

}
