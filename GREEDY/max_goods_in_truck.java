package GREEDY;

import java.util.Arrays;

public class max_goods_in_truck {
       public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        int totalunits = 0 ;

        for(int[] box : boxTypes){
            int boxcount = box[0];
            int units = box[1] ;

            int take = Math.min(truckSize ,boxcount);
            totalunits += take * units ;
            truckSize -= take ;

            if(truckSize == 0)break ;
        }
        return totalunits ;

        
    }
    
}
