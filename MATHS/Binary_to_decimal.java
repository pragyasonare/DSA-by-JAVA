public class Binary_to_decimal {
      public static void binary_to_deciaml (int binNUM){
   int mynum = binNUM;
    int power= 0 ;
    int decimal =0 ;
    int lastdig;

    while(binNUM>0){
        lastdig = binNUM  % 10 ;

        decimal = decimal + (lastdig * (int)Math.pow(2,power));
        ///1---math.pow used when we need power first num is base
        // and 2nd one is power
        // 2--- (int) is used for typecaste coz math.pow return
        //double value
         power++ ;
         binNUM  = binNUM/10 ;

    }
        System.out.println("decimal of " + mynum + "=" + decimal);
    }

    public static void main(String[] args) {
        binary_to_deciaml(101);
    }
    
}
