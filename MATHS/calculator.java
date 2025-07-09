import java.util.Scanner;

public class calculator {

        public static void main(String[] args) {
         int a, b ,ch ;
         Scanner sc = new Scanner(System.in);
        System.out.println("enter thr first number");
        a = sc.nextInt();
        System.out.println("enter the second number");
        b = sc.nextInt();
        System.out.println("Enter your choice\n 1-> add \n 2-> subtract \n 3 -> multiply 5\n 4 -> divide \n Enter your choice:");
        ch = sc.nextInt();
        if(ch==1)
            System.out.println("addition=" +       (a+b));
        else if (ch==2)
            System.out.println("subtraction=" +    (a-b));
        else if (ch==3)
            System.out.println("multiplication=" + (a*b));
        else if (ch==4)
            System.out.println("division="+        (a%b));

    }
    
}
