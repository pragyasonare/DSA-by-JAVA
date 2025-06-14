package RECURSION;

public class _2_Increase_order {
       public static void printincrease(int n ){
        if (n==1){
            System.out.println(1);
        }
        printincrease(n-1);
        System.out.println(n);
    }


    public static void main(String[] args) {
        int n =5;
    }
    
}
