package MATHS;

import java.util.Scanner;

public class _7_palindromic {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , rev =0 ,z ;
        System.out.println("enter thr number ");
        n = sc.nextInt();
        z = n ;
        while (n>0 )
        {
            rev = (rev*10 ) + n%10 ;
              n =  n/10 ;
        }
        if  (rev == z)
        System.out.println(" number is palidromic  ");
        else
            System.out.println(" number is not palidromic ");
    }

    
    
}
