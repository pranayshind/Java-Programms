package Programms_test;

import java.util.Scanner;
public class P_3{
    public static void main (String args[]){
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enetr number :");
        int a = in.nextInt();
        
        for(int i=0;i<=a;i++){
            for(int j=1;j<=a-i;j++){
                System.out.print(j+" ");
                
            }
           
            
            System.out.println("");      
            }
          
        
    }
}
