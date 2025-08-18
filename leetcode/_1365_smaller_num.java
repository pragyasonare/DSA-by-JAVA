public class _1365_smaller_num {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length ;
        int sorted [] = nums.clone();
        Arrays.sort(sorted) ;

        HashMap<Integer , Integer > map = new HashMap <>();
        for(int i =0 ; i<n ; i++){
            map.putIfAbsent(sorted[i], i);  
        }

        int [] result = new int [n] ;
        for(int i =0 ; i<n ; i++){
            result[i] = map.get(nums[i]);
        }

        return result ; 
        
    }
}
    

