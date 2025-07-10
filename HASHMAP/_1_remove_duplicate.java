package HASHMAP;

import java.util.HashMap;

public class _1_remove_duplicate {
        String removeDups(String s) {
        StringBuilder result = new StringBuilder() ;
        HashMap< Character , Integer > seen = new HashMap<>();
        
        for(int i=0 ; i<s.length() ; i++ ){
            char ch = s.charAt(i);
            
            if(!seen.containsKey(ch)){
                seen.put(ch, seen.getOrDefault(ch , 0)+ 1);
                result.append(ch);
            }
            
        }
        return result.toString();
        
    }
    
}
