package MATHS;

import java.util.Scanner;

public class _5_sum_of_digits {

        public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int n, sum =0 ;
        System.out.println("enter the number");
        n = sc.nextInt();
        while(n>0)
        {
            sum = sum + n %10 ;
              n = n/10;
        }
        System.out.println(" the num of digit of the given number is"+ sum);




    }
    
}
