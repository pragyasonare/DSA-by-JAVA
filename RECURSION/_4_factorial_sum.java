package RECURSION;

public class _4_factorial_sum {
      public static int factorial(int n){
        //print factorial
        if (n==0){
            return 1;
        }
        int fnm1 = factorial(n-1);
        int fn = n * fnm1;
        return fn;

 // sum of n natural number ----

//  if (n==1 ){
//      return 1;
//  }
//  else
//      return  n+ factorial(n-1);
    }

    public static void main(String[] args) {
     int n =5 ;
        System.out.println(factorial(n));
    }
    
}
