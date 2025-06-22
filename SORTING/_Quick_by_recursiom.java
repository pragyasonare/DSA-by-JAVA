package SORTING;

public class _Quick_by_recursiom {
      public static void printarr( int arr[]){
        for (int i =0 ; i< arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println( );
    }
    public static void quicksort(int arr[] , int si , int ei){

        //base case
        if (si>=ei){
            return;
        }

        //last element
        int pivotindex = partition(arr,si,ei);
        quicksort(arr,si,pivotindex -1); // left part
        quicksort(arr,pivotindex+1 ,ei ); //right part

    }
    public static int partition(int arr [] , int si , int ei){
        int pivot = arr[ei] ;
        int i = si-1 ; // to make place for element smaller than pivot

        for (int j = si ; j<ei ; j++ ){
            if ( arr[j] <= pivot ){
                i++;
                //swap
                int temp = arr[j];
                arr[j]=  arr[i];
                arr[i]= temp ;
            }
        }
        i++;
        //swap for pivot
        int temp = pivot ;
        arr[ei]=  arr[i];  //pivot = arr[ei] ---line no 23 ;
        arr[i]= temp ;
         return i ;
    }

    public static void main(String[] args) {
        int arr[ ]= {6,3,9,8,2,5};
        quicksort(arr, 0 , arr.length-1 );
        printarr(arr);
    }
    
}
