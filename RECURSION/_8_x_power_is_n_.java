package RECURSION;

public class _8_x_power_is_n_ {

    public static int power(int x,int n){

    if (n==1){
        return x;
    }
    else
        return  x  * power(x,n-1);
}
    public static void main(String[] args) {
        int n=10;
        int x=2;
        System.out.println(power(2,10));
    }
    
}
