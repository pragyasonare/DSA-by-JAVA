package STRINGS;

import java.util.HashMap;

public class _9_isomorphic_string {

      public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false ;
        }
        HashMap<Character, Character> str1 = new HashMap<>();
        HashMap<Character, Character> str2 = new HashMap<>();

        for(int i =0 ; i<s.length();i++){
            char ss = s.charAt(i);
            char tt = t.charAt(i);

            if(str1.containsKey(ss) && str1.get(ss) != tt){
                return false;
            }
            if(str2.containsKey(tt) && str2.get(tt) != ss){
                return false;
            }

            str1.put(ss,tt);
            str2.put(tt,ss);

        }

        return true ;
        
    }
    
}
