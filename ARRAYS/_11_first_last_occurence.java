import java.util.ArrayList;

public class _11_first_last_occurence {
    

     ArrayList<Integer> find(int arr[], int x) {
         ArrayList<Integer> result = new ArrayList<>();
        
        int first = -1 , last = -1 ;
        
        int low = 0 , high = arr.length-1 ;
        
        while(low<= high){
            int mid = low + (high - low) /2 ;
            if(arr[mid] == x){
                first = mid ;
                high = mid -1 ;
            
            }
            else if( arr[mid] > x){
                high = mid -1 ;
            }else{
                low = mid + 1 ;
            }
            
        }
        
        //last occurence 
        
          low = 0 ;
          high = arr.length-1 ;
          
          while(low<= high){
            int mid = low + (high - low) /2 ;
            if(arr[mid] == x){
                last = mid ;
                low  = mid +1 ;
            
            }
            else if( arr[mid] > x){
                 high = mid -1 ;
            }else{
                 low = mid + 1 ;
            }
            
        }
        
        result.add(first);
        result.add(last);
        return result ;
        
        
    }
}


