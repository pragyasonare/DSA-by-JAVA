import java.util.Arrays;

public class _179_largest_numbers {

    class Solution {
    public String largestNumber(int[] nums) {
        String []  arr = new String[nums.length] ;
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Step 2: Sort using custom comparator
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // Step 3: Edge case → if first number is "0", result is "0"
        if (arr[0].equals("0")) return "0";

        // Step 4: Build the result
        StringBuilder sb = new StringBuilder();
        for (String s : arr) sb.append(s);

        return sb.toString();
        
    }
}
    
}
