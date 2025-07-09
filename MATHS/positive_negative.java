import java.util.Scanner;

public class positive_negative {
     public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        a = sc.nextInt();
        if (a>0)
            System.out.println("its positive");
        else if ( a<0)
            System.out.println( "its negative");
        else
            System.out.println("number is zero like you");


    }
    
}
