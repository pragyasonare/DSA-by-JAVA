package leetcode;

public class max_subarray_product {

    class Solution {
    public int maxProduct(int[] nums) {

        int result = nums[0];
        int maxprod = nums[0];
        int minprod = nums[0];

        for(int i=1 ; i<nums.length ; i++){
            int current = nums[i];

            if(current < 0){
                int temp = maxprod ;
                maxprod = minprod ;
                minprod = temp ;
            }

            maxprod = Math.max(current , current * maxprod);
            minprod = Math.min(current , current * minprod);

            result  = Math.max(result , maxprod);

        }

        return result ;

        
    }
}
    
}
