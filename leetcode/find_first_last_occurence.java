public class find_first_last_occurence {

    class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }
    
    private int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1, ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid - 1; // keep searching left
            } else {
                left = mid + 1;
            }
            if (nums[mid] == target) ans = mid;
        }
        return ans;
    }
    
    private int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1, ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1; // keep searching right
            } else {
                right = mid - 1;
            }
            if (nums[mid] == target) ans = mid;
        }
        return ans;
    }
}

    
}
