package Programms_test;

import java.util.Scanner;
public class P_2{
    public static void main (String args[]){
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enetr number :");
        int a = in.nextInt();
        
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a-i;j++){
                System.out.print(" ");
                
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
                
            }
            
            System.out.println("");
        }
    }
}