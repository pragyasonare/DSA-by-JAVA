package RECURSION;

public class _1_Decrese_order {
        public static void decrease_order(int n ){
        if (n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        decrease_order(n-1);
    }


    public static void main(String[] args) {
        int n =10;
        decrease_order(n);

    }
    
}
