public class Num_to_Binary {
       public  static  void  num_t0_binary(int num ){
        int mynum = num ;
        int rem  ;
        int bin = 0 ;
        int power= 0 ;

        while(num>0){

           rem  = num % 2  ;/// for reminder
           bin = bin + (rem *  (int)Math.pow(10,power));
           power++;

            num = num/2 ;/////for next qutioent
        }
        System.out.println( "binary for of my " + mynum + "= " + bin);
    }

    public static void main(String[] args) {

        num_t0_binary(777);
    }
    
}
