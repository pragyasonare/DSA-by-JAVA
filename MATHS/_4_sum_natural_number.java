package MATHS;

import java.util.Scanner;

public class _4_sum_natural_number {

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i , n, add=0 ;
        System.out.println("enter value of N");
        n= sc.nextInt();
        for (i = 0; i<=n ; i++)
            add = add +  i ;
        {
            System.out.println("addition =" + add);
        }


    }

    
}
