import java.util.HashMap;

public class _9_non_repeating_character {

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
    

