package SORTING;

public class Selection {
    public static void selectionsort(int arr[]){
       for(int i=0 ; i<arr.length-1 ; i++){
           int minposs= i ;
           for(int j= i+1 ; j<arr.length ; j++){
               if (arr[minposs] >  arr[j]){
                   minposs =j ;
               }
           }
           //swap
           int temp = arr[minposs];
           arr[minposs]= arr[i];
           arr[i] = temp ;
       }
}
    public static void  printArr(int arr[]){
        for(int i=0 ; i< arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println( );
    }

    public static void main(String[] args) {
        int arr[]= {5,4,1,3,2};
        selectionsort( arr);
        printArr(arr);
    }
    
}
