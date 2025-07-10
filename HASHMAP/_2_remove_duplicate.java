package HASHMAP;

import java.util.HashSet;

public class _2_remove_duplicate {

        String removeDuplicates(String s) {
        
        HashSet<Character>set = new HashSet<>();
        StringBuilder ss = new StringBuilder();
        
        for(char c  : s.toCharArray()){
            if(!set.contains(c)){
                set.add(c);
                ss.append(c);
            }
            
        }
        return ss.toString(); 
        
    }
    
}
