package ARRAYS;

public class _3_binary_search {
    public static int binary_search(int numbers[], int key ){
        int start =0 , end = numbers.length -1 ;
        while (start<=end ){
            int mid = (start + end )/2 ;
//comparison
            if (numbers[mid] == key ){
                return mid ;
            }
            if (numbers[mid] < key ){
                start = mid + 1 ;
            }
            if (numbers[mid] >key ){
                end = mid - 1 ;
            }
            
        }
        return -1 ;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 6;
        System.out.println(binary_search(numbers,key));
    }

    
}
