package STRINGS;

import java.util.HashSet;
import java.util.Set;

public class _7_longest_nonrepeating_string {

    class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character>set = new HashSet<>();
        int right = 0 , left =0 ,  maxlen =0 ;
        
        for(right= 0 ; right<s.length() ; right++){
            char curr = s.charAt(right);


            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left ++ ;
            }

            set.add(curr);
             maxlen = Math.max(maxlen , right - left + 1);
        }
        return maxlen ;
        
        
    }
}
    
}
