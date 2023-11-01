package programms;

public class sumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int[] age = {12,4,5,3,5,6,8,9};
		for(int a : age) {
			sum+=a;
		}
		System.out.println("Sum of all elements of given array : " +sum);
	}

}
