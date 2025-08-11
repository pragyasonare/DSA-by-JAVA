public class _12_uncommon_string {

    
    public String[] uncommonFromSentences(String s1, String s2) { 
        String[] words = (s1 + " " + s2).split(" ");
        Map<String, Integer> map = new HashMap<>();

        for(String word : words){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

         List<String> result = new ArrayList<>();
         for(String word : map.KeySet())  {
            if(map.get(word) == 1){
                result.add(word);
            }
         }

         return result.toArray(new String[0]);


    }

    
}
