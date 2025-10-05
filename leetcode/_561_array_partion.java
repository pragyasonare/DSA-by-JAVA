import java.util.Arrays;

public class _561_array_partion {


     public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length ;
        int sum =0;

        for(int i=0 ; i<n ; i+=2){
            sum += nums[i];
        }

        return sum ;
        
    }
}
