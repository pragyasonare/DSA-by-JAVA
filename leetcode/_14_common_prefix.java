public class _14_common_prefix {
     public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Pick the first string as reference
        String first = strs[0];

        for (int i = 0; i < first.length(); i++) {
            char c = first.charAt(i);

            // Compare with all other strings
            for (int j = 1; j < strs.length; j++) {
                // If index is out of range OR mismatch found → return
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return first.substring(0, i);
                }
            }
        }

        return first; // whole first string is prefix
    }
    
}
