package MATHS;

import java.util.Scanner;

public class _11_print_table {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i , j   ;
        System.out.println("enter the number ");
        i= sc.nextInt();
        for ( j = 1 ;j<=10 ;j++)
        {
            System.out.println(i*j);

        }
    }
}
