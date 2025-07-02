package MATHS;

import java.util.Scanner;

public class _12_exponent {

      public static void main(String[] args) {
        int x,y, product=1  ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter thr base");
        x = sc.nextInt();
        System.out.println("enter thr power");
        y = sc.nextInt();
        while ( y>0)
        {
            product = product * x ;
            y--;
        }
        System.out.println("value = " + product);
        
    }
    
}
