package GREEDY;

import java.util.Arrays;

public class overlapping_events {
     public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 0){
            return 0;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 0 ;
        int prevend = intervals[0][1];

        for(int i= 1; i<intervals.length ; i++){
            if(intervals[i][0] < prevend){
                count++ ;
            }
            else{
                prevend = intervals[i][1];
            }
        }
         return count ++;
    }
    
}
