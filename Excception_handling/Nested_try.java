package Excception_handling;

import java.util.Scanner;

public class Nested_try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		arr[0]=2;
		arr[1]=4;
		arr[2]=8;
		arr[3]=14;
		arr[4]=10;
		
		
		Scanner in = new Scanner(System.in);
		boolean flag =true;
		while(flag) {
			
		       try {
		    	   
			        try {
				       System.out.println("Enter index of numbder: ");
				       int ind = in.nextInt();
				       System.out.println("number present at give index is : "+arr[ind]);
				       flag=false;
			            }
			        catch(ArrayIndexOutOfBoundsException e) {
				    System.out.println("given index is not present in aray ");
				
			            }
		           }
		       
		       catch(Exception e) {
		       System.out.println("some other exception occred: ");
		       }
		
		}
	

	}

}
