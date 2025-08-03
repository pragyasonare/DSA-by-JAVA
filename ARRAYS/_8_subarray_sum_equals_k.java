public class _8_subarray_sum_equals_k {
    

     public  static int subarraySum(int[] nums, int k) {
         int count = 0, sum = 0;
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, 1); // To handle cases where subarray itself sums to k

        for (int num : nums) {
            sum += num; // Current prefix sum
            
            // Check if (sum - k) exists in the hashmap
            if (prefixSumMap.containsKey(sum - k)) {
                count += prefixSumMap.get(sum - k);
            }

            // Store the current sum in hashmap
            prefixSumMap.put(sum, prefixSumMap.getOrDefault(sum, 0) + 1);
        }

        return count;
        
    }

    public static void main(String[] args) {
        int nums [] = {1,1,1} ;
        int k = 2 ;
        int ans = subarraySum(nums, k)
        System.out.println(ans);
    }
}
