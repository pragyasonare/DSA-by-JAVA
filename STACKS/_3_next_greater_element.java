package STACKS;

import java.util.HashMap;
import java.util.Map;

public class _3_next_greater_element {

     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer>s = new Stack<>();
        Map<Integer , Integer> map = new HashMap<>();

        for(int i = nums2.length -1 ; i>= 0 ; i--){
            while(!s.isEmpty() && s.peek() <= nums2[i]){
                s.pop() ;
            }

            if(s.isEmpty()){
                map.put(nums2[i] , -1);
            }
            else{
                map.put(nums2[i] , s.peek());
            }
            s.push(nums2[i]) ;
        }

        int[] result = new int[nums1.length];
        for(int i=0 ; i < nums1.length ;i++){
            result[i] = map.get(nums1[i]) ;

        }
        return result ;
        
    }
    
}
