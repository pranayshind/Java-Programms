package Array;
import java.util.Scanner;

public class towD_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =  new Scanner(System.in);
		System.out.println("enetr number of rows");
		int n = in.nextInt();
		System.out.println("enetr number of columns");
		int m = in.nextInt();
		
		int[][] a =  new int[n][m];
		System.out.println("Enter "+n*m+" Elements of matrix");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=in.nextInt();
			}
		}
		
		int[][] b = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				b[i][j]=a[i][j]*a[i][j];
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(b[i][j]+" ");   //we can print directly b[i][j] in above for loop
			}
			System.out.println("");
		}

	}

}
