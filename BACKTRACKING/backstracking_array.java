package BACKTRACKING;

public class backstracking_array {
     public static void changeArr(int arr[] , int i , int value){

        //basecase
        if (i== arr.length){
            printarr(arr);
            return;
        }

        //recursion or kaam
        arr[i] = value;
        changeArr(arr,i+1,value+1);
        arr[i]= arr[i]-2; //backtracking step
    }
    public static void printarr(int arr[]){
        for (int i =0 ; i < arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr [] = new int[5];
        changeArr(arr, 0 , 1);
        printarr(arr);

    }
}
