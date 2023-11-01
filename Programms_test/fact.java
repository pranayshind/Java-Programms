package Programms_test;
import java.util.Scanner;
public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.println("Enter number ");
        int a = in.nextInt();
        int b = 1;
        for(int i=1;i<=a;i++){
            b = b*i;
        }
        System.out.println(b);

	}

}
