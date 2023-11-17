package ArrayList;
import java.util.Scanner;
import java.util.ArrayList;


public class leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Enter size of number array: ");
		int a = in.nextInt();
		
		int[] arr1 = new int[a];
		System.out.println("Enter elements in array: ");
		for(int i=0;i<a;i++) {
			arr1[i] = in.nextInt();
		}
		
		System.out.println("Enter size of index array: ");
		int b = in.nextInt();
		
		int[] arr2 = new int[b];
		System.out.println("Enter elemnents of index array: ");
		for(int i=0;i<b;i++) {
			arr2[i] = in.nextInt();
		}
		/*
		 * Input: nums = [0,1,2,3,4], index = [0,1,2,2,1] Output: [0,4,1,3,2]
		 
		 */
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i=0;i<arr1.length;i++) {
			l.add(arr2[i],arr1[i]);
		}
		System.out.println("output array is: "+l);
		/*
		 * for(Integer n:l) { System.out.println(n); }
		 */
		
		/*
		 * int[] arr3 = new int[arr1.length]; System.out.println("output array is: ");
		 * for(int i=0;i<l.size();i++) { arr3[i]=l.get(i); } for(int
		 * i=0;i<arr3.length;i++) { System.out.println(arr3[i]); }
		 */
		}

}
