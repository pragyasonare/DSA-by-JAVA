package ARRAYS;

public class _8_kadanes_algo {
     public static void kadanes(int numbers[]){
        int maxsum = Integer.MIN_VALUE ;
        int cs =0 ;

        for(int i =0 ; i<numbers.length ; i++){
            cs = cs + numbers[i] ;
            if(cs<0 ){
                cs = 0 ;
            }
            maxsum = Math.max(cs,maxsum);
        }
        System.out.println("our max sub array sum is :" + maxsum);
    }


    public static void main(String[] args) {
        int numbers[]= {-2,-3,4,-1,-2,1,5,-3};
        //int numbers []= {2,4,6,8,10};
        kadanes(numbers);
    }
    
}
