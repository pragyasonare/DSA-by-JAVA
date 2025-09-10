public class _678_vaild_parathesis {

     public boolean checkValidString(String s) {
        int high = 0 ;
        int low = 0;

        for(char c : s.toCharArray()){
            if(c == '('){
                low ++ ;
                high ++ ;
            }
            else if(c == ')'){
                low -- ;
                high -- ;
            }
            else{ // c == '*'
            low -- ;
            high ++ ;
            }

             if (high < 0) return false; // too many ')'
            if (low < 0) low = 0;       // low can't be negative
        }
        return low == 0 ;

        
    }
    
}
