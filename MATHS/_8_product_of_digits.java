package MATHS;

import java.util.Scanner;

public class _8_product_of_digits {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , product = 1;
        System.out.println("enter thr number");
        n = sc.nextInt();
        while (n>0)
        {
            product = product * (n%10) ;
                  n = n/10 ;

        }
        System.out.println("The product is = "  +  product );
    }
    
}
