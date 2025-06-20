package ARRAYS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _4_array_duplicates {
    public List<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {  // if already seen, add to duplicates
                duplicates.add(num);
            }
        }

        list.addAll(duplicates);
        return list;

    }
    
}
