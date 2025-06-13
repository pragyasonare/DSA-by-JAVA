package ARRAYS;

public class _9_trapped_rainwater { public static int trappedRainwater(int height[]){
      int n = height.length ;

       int leftmax[] = new int[height.length];
       leftmax[0] = height[0];
       for( int i =1 ; i<height.length ; i++){
           leftmax[i] = Math.max(height[i], leftmax[i-1]);
       }
       int rightmax [] = new int[height.length];
       rightmax[n-1] = height[n-1];
       for (int i=n-2 ; i>=0 ; i--){
           rightmax[i] = Math.max(height[i] , rightmax[i+1]);
       }
       int waterlevel =0 ;
       int trappedwater =0 ;
       for (int i=0 ; i<height.length ; i++) {
           waterlevel  = Math.min(leftmax[i], rightmax[i]);
           trappedwater += waterlevel - height[i];
       }
       return trappedwater ;
    }

    public static void main(String[] args) {
        int heights[]= {4,2,0,6,3,2,5};
        System.out.println( trappedRainwater(heights));

    }
    
}
