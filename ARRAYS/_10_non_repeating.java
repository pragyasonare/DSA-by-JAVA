package ARRAYS;

import java.util.HashMap;

public class _10_non_repeating {

     static char nonRepeatingChar(String s) {
        
        HashMap<Character , Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray()){
            map.put(c , map.getOrDefault(c , 0)+ 1);
            
        }
        
        for(char c : s.toCharArray()){
           if( map.get(c)== 1){
               return c ;
           }
        }
        
        return '$';
        
    }
    
}
