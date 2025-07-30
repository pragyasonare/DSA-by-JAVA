public class Binary_string {

     public static boolean isBinary(String s) {
        // Your code here
        for(int i=0 ; i<s.length();i++){
            char ch = s.charAt(i);
            
            if( ch != '0' && ch != '1'){
                return false;
            }
           
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "776372" ; //false 
      //String str = "1010101" ; //true


        boolean ans  = isBinary(str) ;
        System.out.println(ans);
    }
    
}
