package ARRAYS;

public class _2_linear_search {    public static int linearsearch (int numbers[], int key )
    {
        for (int i=0 ; i<numbers.length ; i++ ){
            if (numbers[i] ==key){
                return  i ;
            }
        }
        return -1 ;
    }
    public static void main(String[] args) {
        int number[] = {55,88,44,1,99,9,6,5,4,7};
        int key = 99;
       int index = linearsearch(number,key);
       
       if (index == -1 ){
           System.out.println("not found key");
       } else {
        System.out.println( "the key was found at index "+ index);
       }
    }

    
}
