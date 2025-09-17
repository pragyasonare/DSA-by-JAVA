public class _3163_string_compression {

      public String compressedString(String word) {
        
       StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<word.length() ; i++){
            int count = 1 ;

  while (i < word.length() - 1 && word.charAt(i) == word.charAt(i + 1) && count < 9){
                count++ ;
                i++;
            }
            sb.append(count).append(word.charAt(i));
          
        }
        return sb.toString() ;
    
}
}
