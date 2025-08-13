package leetcode;

public class square_of_sorted_array {

  
    public int[] sortedSquares(int[] nums) {
        int n = nums.length ;
        int [] result = new int [n];

        int pos = n-1 ;
        int left =0 ;
        int right = n -1 ;

        while( left <= right){

            int leftsq = nums[left] * nums [left];
            int rightsq = nums[right] * nums [right];

            if(leftsq > rightsq){
                result[pos] = leftsq ;
                left++ ;
            }
            else{
                result[pos] = rightsq ;
                right-- ;

            }
            pos -- ;
        }
        return result ;


        
    }
}
    

