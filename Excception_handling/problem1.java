package Excception_handling;

import java.util.Scanner;

//allow you to keep accessing array untill valid index is given. if max retries 5 print error

public class problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int[] arr = new int[4];
		arr[0]= 4;
		arr[1]= 8;
		arr[2]= 4;
		arr[3]= 16;
		
		
		boolean flag = true; //not required flag variable for this program
		int i=1;
		while(flag && i<6) {
			try {
				System.out.println("enter index: ");
				int a = in.nextInt();
				System.out.println("value present at given inde is: "+arr[a]);
				break;
			}
			catch(Exception e) {
				System.out.println("Enterd index is not present in array");
				i++;
			}
		}
		if(i>=5) {
			System.out.println("error");
		}
		
		
		

	}

}
