package Programms_test;
import java.util.Scanner;
public class perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.println("Enetr Number ");
        int a = in.nextInt();
        
        int count =0;
        for(int i=1;i<=a/2;i++){
            if(a%i==0){
                count+=i;
            }
        }
        if(count==a){
            System.out.println("perfect number");
        }
        else{
            System.out.println("Not perfect number");
        }

	}

}
