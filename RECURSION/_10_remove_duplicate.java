package RECURSION;

public class _10_remove_duplicate {
     public static String duplicate(String str , int index , StringBuilder result , boolean []see) {
        if (index == str.length()) {
            return result.toString();
        }
        char ch = str.charAt(index);
        if (!see[ch]) {
            see[ch] = true;
            result.append(ch);
        }
        return duplicate(str, index + 1, result, see);
    }
    public static void main(String[] args) {
        String s = "aaaappppnaaacccooooollleegge" ;
        boolean [] seen = new boolean[256];
        String  result = duplicate(s,0,new StringBuilder(),seen) ;
        System.out.println(result);

        //The size 256 is used because there are 256 possible ASCII characters —
        // every character (like 'a', 'b', 'A', '1', '@', etc.) has a unique number
        // from 0 to 255 in the ASCII table.
    }
    
}
