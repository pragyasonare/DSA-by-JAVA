package RECURSION;

public class _5_first_last_occurece {

     public static int FO(int arr[], int key,int i){
        if (i==arr.length){
            return -1;
        }
        if (arr[i]==key){
            return i;
        }
        return FO(arr,key, i+1);
    }
    public static int lastoccurence(int arr[] , int key , int i){
        if(i<0){
            return -1 ;
        }
        if(arr[i]== key){
            return i;
        }
        return lastoccurence(arr,key,i-1);
    }

    public static void main(String[] args) {
        int ar[]= {8,3,6,9,5,10,2,5,3};
        int key = 5;
        int i;
        System.out.println(FO(ar,key,0));
        System.out.println(lastoccurence(ar,key,ar.length-1));
    }
    
}
