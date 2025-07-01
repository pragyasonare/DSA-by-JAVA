package MATHS;

import java.util.Scanner;

public class _10_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , factorial = 1;
        System.out.println("enter the number whose factorial you want to find");
        n = sc.nextInt();
        while (n>=1)
        {
            factorial = factorial * n ;
            n= n-1 ;

        }
        System.out.println("The factorial is "+ factorial );




    }
    
}
