import java.util.Arrays;

public class _628_maximum_product {

     public int maximumProduct(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length ;

        int one = nums[n-1] * nums[n-2]* nums[n-3] ;
        int two = nums[0] * nums[1] * nums[n-1] ;

        return  Math.max(one , two);

    }
    
}
