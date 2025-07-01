package MATHS;

import java.util.Scanner;

public class _9_prime_num {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n , count = 0 ,i ;
        System.out.println(" enter the number");
        n = sc.nextInt();

        i = 1 ; //intial value -- vahi se start hoga voh
        while ( i<=n)
        {
            if ( n % i == 0 ){
             count ++ ;
            }

            i ++ ;
        }
         if (count == 2 )
        System.out.println(" its prime number");
        else
            System.out.println(" not prime number ");

    }
    
}
