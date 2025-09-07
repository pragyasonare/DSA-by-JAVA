public class _921_make_valid_paranthesis {
     public  static int minAddToMakeValid(String s) {
      int open = 0 ;
        int add = 0;

        for(int c : s.toCharArray()){
            if(c == '('){
                open ++ ;
            }

            else {// match with '('
                if(open > 0){
                    open -- ; // match with '('
                }
                else{
                    add ++ ;  // need one '('
                }

            }
        }

        return add + open ;
        // open = extra '(' left
        // add = extra ')' we fixed

        
    }

    public static void main(String[] args) {
        String S = "())" ;
        int result = minAddToMakeValid(S);
        System.out.println(result);
        

        
    }
    
}
