package ARRAYS;

import java.util.Arrays;

public class _12_two_sum_II {
     public  static int[] twoSum(int[] numbers, int target) {

        int left =  0 ;
        int right = numbers.length - 1 ;
        int sum = 0 ;

        while(left < right){
            sum = numbers[left] + numbers[right] ;

            if(sum == target){
                return new int[]{left +1 , right +1};
            }
            else if( sum > target){
                right -- ;
            }
            else{
                left ++ ;
            }
           
        }

        return new int [] {-1 , -1} ;
        
    }

    public static void main(String[] args) {
        int [] numbers = {2,7,11,15} ;
        int target = 9 ;
     System.out.println( Arrays.toString(twoSum(numbers, target)));  
    

    }
    
}
