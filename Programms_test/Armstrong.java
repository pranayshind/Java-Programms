package Programms_test;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.println("Enter number ");
        int a = in.nextInt();
       int 
       d = a;
        int b = 0;
        while(a!=0){
             int c = a%10;
             b+=c*c*c;
          
             a=a/10;
             
        }
        if(b==d){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }

	}

}
