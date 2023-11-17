package Array;

import java.util.Scanner;

public class Add_matrix {

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

		
		
		System.out.println("enetr number of rows");
		int b = in.nextInt();
		System.out.println("enetr number of columns");
		int c = in.nextInt();
		
		int[][] d =  new int[b][c];
		System.out.println("Enter "+b*c+" Elements of matrix");
		
		

		for(int i=0;i<b;i++) {
			for(int j=0;j<c;j++) {
				d[i][j]=in.nextInt();
			}
		}
		
		
		int[][] e = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				e[i][j]=a[i][j]+d[i][j];
			}
		}
		System.out.println("1st matrix is: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(a[i][j]+" ");   //we can print directly b[i][j] in above for loop
			}
			System.out.println("");
		}
		
		System.out.println("2nd matrix is: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(d[i][j]+" ");   //we can print directly b[i][j] in above for loop
			}
			System.out.println("");
		}
		 
		 
		
		System.out.println("addition of both matrix is: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(e[i][j]+" ");   //we can print directly b[i][j] in above for loop
			}
			System.out.println("");
		}


	}

}
