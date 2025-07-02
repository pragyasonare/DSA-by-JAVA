package MATHS;

import java.util.Scanner;

public class _13_Armstrong_number {
    
    public static void main(String[] args) {
        int n , z ,count=0, digit;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER TO CHECK ITS ARMSTRONG NUMBER OR NOT ");
        n = sc.nextInt();
        z = n ;

        while(z>0){
            count ++ ;
            z = z/10 ;
        }
        System.out.println("The number of digits are " +  count );


        z= n ;
        int sum = 0 ;
        while(z>0){
             digit = z % 10 ;
            int product = 1 ;

             for (int i =0 ; i< count ; i++){
                 product = product * digit ;
             }
            sum = sum + product ;
            z = z/10 ;

        }

        System.out.println( n +  (sum == n ? "is a Armstrong number " : "  is not a Armstrong number "));



    }
    
}
