package Leetcode;
import java.util.Scanner;
/*Input: nums = [1,15,6,3]
Output: 9
Explanation: 
The element sum of nums is 1 + 15 + 6 + 3 = 25.
The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
The absolute difference between the element sum and digit sum is |25 - 16| = 9.*/

public class Difference_Between_Element_Sum_and_Digit_Sum_of_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int a = in.nextInt();
		int[] arr = new int[a];
		System.out.println("Enter elements in array: ");
		for(int i=0;i<arr.length;i++) {
			
			arr[i] = in.nextInt();
		}
		
		int c =0;
		int d =0;
		for(int i=0;i<arr.length;i++) {
			c+=arr[i];
			
			int val = arr[i];
			int b;
			while(val>0) {
				b=val%10;
				d+=b;
				val=val/10;
				
			}
			
		}
		
		System.out.println(Math.abs(c-d));
		
		
		
	

	}

}
