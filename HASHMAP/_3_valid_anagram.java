public class _3_valid_anagram {

     public static boolean isAnagram( String s , String t){
        if (s.length() != t.length()){
            return false ;
        }
        HashMap<Character , Integer> hm = new HashMap<>();

        // this is to create hashmap
        for (int i =0 ; i<s.length() ; i++){
            char sh = s.charAt(i);
            hm.put(sh, hm.getOrDefault(sh, 0)+ 1);
        }

        // to check in t is value exist or not
        for (int i= 0 ; i<t.length() ; i++){
            char ch = t.charAt(i);
            if (hm.get(ch) != null){
                if (hm.get(ch) ==1){
                    hm.remove(ch);
                }else {
                    hm.put(ch, hm.get(ch)-1);
                }
            }else {
                return false;
            }
        }
        return hm.isEmpty();
    }

    public static void main(String[] args) {
        String s = "race";
        String t = "care";
        System.out.println(isAnagram(s,t));
    }
    
}
