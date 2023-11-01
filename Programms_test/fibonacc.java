package Programms_test;
import java.util.Scanner;
public class fibonacc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = in.nextInt();
        int a=0;
        int b=1;
        
        for(int i=1;i<=n;i++) {
        	int c =a+b;
        	a=b;
        	b=c;
        	System.out.println(c);
        	
        /*int a = 0,b=1, c=0;
        System.out.print(a+" "+b+" ");
        for(int i=1;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");*/

	}

}
}