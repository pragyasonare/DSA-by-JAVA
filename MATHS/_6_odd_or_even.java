package MATHS;

import java.util.Scanner;

public class _6_odd_or_even {

      public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
         int n , product = 1, sum = 0, digit ;
        System.out.println("enter the number");
        n = sc.nextInt();
        while ( n>0)
        {
            digit = n % 10;

            if ( digit % 2 == 0 ){
                sum = sum + digit ;}

            else{
                product = product * digit ;}

            n = n / 10 ;

        }
        System.out.println("product  = "+ product + " \n sum = "  + sum );
    }
    
}
