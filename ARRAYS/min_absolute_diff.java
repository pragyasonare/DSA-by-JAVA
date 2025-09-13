import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class min_absolute_diff {
    
     public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();

        int mindiff = Integer.MAX_VALUE;

        for(int i = 1 ; i<arr.length ; i++){
            mindiff = Math.min(mindiff , arr[i] - arr[i - 1]);
        }

        for(int i=1 ; i<arr.length ;i++){
            if( arr[i] - arr[i - 1]== mindiff){
                result.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }
        return result ;
    }
}
