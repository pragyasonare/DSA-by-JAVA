import java.util.HashMap;

public class _10_single_element {

    class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0) + 1);
        }

        for(int Key : map.KeySet()){
            if(map.get(key) == 1){
                return key  ;
            }
        }

        return -1 ; 
        
    }
}
    
}
