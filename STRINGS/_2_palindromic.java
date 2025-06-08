package STRINGS;

public class _2_palindromic {
      public static boolean palindromic (String str){
        for(int i =0 ; i<str.length(); i++ ){
            int n = str.length() ;
            if (str.charAt(i)== str.charAt(n-1-i)){
                return true ;
            }
        }
        return  false;
    }

    public static void main(String[] args) {
        String pp = "RACECAR" ;
        System.out.println(palindromic(pp));
    }
    
}
