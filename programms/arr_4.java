
//check user entered number is present in given arrray if present display its index numbers and its frequency
/*
 * package Lighthouse;
 * 
 * import java.util.Scanner;
 * 
 * public class arr_4 {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * Scanner in = new Scanner(System.in);
 * System.out.println("Enter size of array: "); int n = in.nextInt(); int[] a =
 * new int[n];
 * 
 * System.out.println("Enter numbers: "); for(int i=0;i<n;i++) { a[i] =
 * in.nextInt(); }
 * 
 * System.out.println("enter numbers"); int n_1 = in.nextInt(); int count =0;
 * 
 * System.out.println("Indexes of given number : "); for(int i=0;i<n;i++) {
 * 
 * if(n_1==a[i]) { System.out.println(i); count++; }
 * 
 * 
 * 
 * 
 * } if(count==0) { System.out.println("given number is not found "); }
 * 
 * 
 * System.out.println("frequency of given number is "+count);
 * 
 * } }
 */
package programms;

import java.util.Scanner;

public class arr_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = in.nextInt();
        int[] a = new int[n];

        System.out.println("Enter numbers: ");
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }

        System.out.println("Enter number to search: ");
        int n_1 = in.nextInt();
        int count = 0;

        System.out.println("Indexes of given number : ");
        for(int i=0; i<n; i++) {
            if(n_1 == a[i]) { 
                System.out.println(i);
                count++;
            }
        }

        if(count == 0) {
            System.out.println("Given number is not found ");
        } else {
            System.out.println("Frequency of given number is " + count);
        }
    }
}
