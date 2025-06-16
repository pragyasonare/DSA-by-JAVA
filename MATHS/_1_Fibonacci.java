package MATHS;

import java.util.Scanner;

public class _1_Fibonacci {
    public static void main(String[] args) {
        
        int n , first =0 , sec = 1 , next = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number upto which u want series");
        n = sc.nextInt() ;

        while(next <= n){
            System.out.println(next);
            first = sec ;
            sec = next ;
            next = first + sec;
        }
    }
    
}
