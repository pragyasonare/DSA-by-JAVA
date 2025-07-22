public class Binary_string {

     boolean isBinary(String s) {
        // Your code here
        for(int i=0 ; i<s.length();i++){
            char ch = s.charAt(i);
            
            if( ch != '0' && ch != '1'){
                return false;
            }
           
        }
        return true;
    }
    
}
