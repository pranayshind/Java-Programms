package Recursion;
import java.util.Scanner;

public class number {
	static int natural(int y,int i){
		if(i<=y) {
			System.out.println(i+" ");
			return natural(y,++i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("enter any number: ");

	}

}
