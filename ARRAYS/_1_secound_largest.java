package ARRAYS;

import java.util.Arrays;

//geeks
public class _1_secound_largest {

     public int getSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        return (second == Integer.MIN_VALUE) ? -1 : second; // return -1 if no second largest
    }

    // can also do this ----------

//     class Solution {
//     public int getSecondLargest(int[] arr) {
//         Arrays.sort(arr);  // Sort in ascending order
//         int n = arr.length;
//         int largest = arr[n - 1];

//         // Traverse from end to find the first element smaller than the largest
//         for (int i = n - 2; i >= 0; i--) {
//             if (arr[i] < largest) {
//                 return arr[i];
//             }
//         }

//         return -1;  // No second largest if all elements are equal
//     }
// }

    

    
}
