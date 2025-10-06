public class _645_set_mismatch {

     public int[] findErrorNums(int[] nums) {
        int n = nums.length ;
        int [] count = new int[n + 1] ;
        int dup = -1  , mis = -1 ;

        for(int num : nums){
            count[num] ++ ;
        }
        
        for(int i = 1 ; i <= n ; i++){
            if(count[i] == 2)dup = i ;
            else if(count[i] == 0)mis = i ;
        }

        return new int[]{dup , mis} ;
    }
    
}
