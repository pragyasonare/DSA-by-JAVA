package RECURSION ;

public class _9_optimised_power {

     public static int  optimised(int x,int n){
        if (n == 0) {
            return 1;
        }
        int halfpowersq = optimised(x,n/2);

        int ans = halfpowersq * halfpowersq;

        //if n is odd
        if (n%2 != 0){
            ans =  x * ans;
        }
        return ans ;

    }

    public static void main(String[] args) {
        int x=2;
        int n=10;
        System.out.println(optimised(x,n));
    }
    
}
