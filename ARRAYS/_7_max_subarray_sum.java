package ARRAYS;

public class _7_max_subarray_sum {
     public static void max_subarray_sum(int numbers[]){
        int currSum = 0 ;
        int maxSum = Integer.MIN_VALUE ;

        for(int i=0 ; i<numbers.length ; i++){
            int start = i ;
            for (int j=i ; j<numbers.length ; j++){
                int end = j ;
                currSum = 0 ;
                for (int k =start ; k<= end ;k++) {
                    currSum = currSum + numbers[k] ; 
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum ;
                }

            }
        }
       // System.out.println("maxsum = " + maxSum);
    }

    public static void main(String[] args) {
        int numbers [] = {2,4,6,8,10};
      max_subarray_sum(numbers);
    }
    
}
