package MATHS;

import java.util.Scanner;

public class _2_Fibonacci {
     public static void main(String[] args) {
        
        int n , first =0 , sec = 1 , next = 0 , term = 1 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of term u want in series");
        n = sc.nextInt() ;

        while(term <= n){
            System.out.println(next);
            first = sec ;
            sec = next ;
            next = first + sec;


            term = term +1;
        }
        
    }

    
}
