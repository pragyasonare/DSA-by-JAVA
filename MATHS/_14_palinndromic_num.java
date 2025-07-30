public class _14_palinndromic_num {

  
    public static boolean isPalindrome(int x) {
        if( x<0){
            return false ;
        }

        int original = x ;
        int rev = 0 ;
        
        while(x>0){

            int digit = x % 10 ;
            rev = rev * 10 + digit ;
            x = x / 10 ;
        }

        return original ==  rev ;
    }

    public static void main(String[] args) {
        int x = 121 ;
        boolean ans = isPalindrome(x);
        System.out.println(ans);
    }
    
}
