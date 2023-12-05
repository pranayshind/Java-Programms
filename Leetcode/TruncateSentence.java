package Leetcode;

import java.util.Scanner;

public class TruncateSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string: ");
		String a = in.next();
		int b = in.nextInt();
		
		
		int space_cnt=0;
        int i=0;
        
        for (i=0;i<a.length();i++){
            if (a.charAt(i) == ' ')
                space_cnt++;
            
            if (space_cnt==b)
                break;

        }
        
        
        if (i== a.length())
            System.out.println(a);;
        
        
        System.out.println(a.substring(0,i));

	}

}
