package ARRAYS;

public class _1_min_max {
      public static int getlargest (int numbers[]){
        int largest = Integer.MIN_VALUE ; //to find the largest value
        int smallest = Integer.MAX_VALUE;

        for(int i =0 ; i<numbers.length ; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if (smallest > numbers[i]){
                smallest =numbers[i];
            }
        }
        System.out.println("smallest num is " + smallest);
        return largest ;
    }

    public static void main(String[] args) {
        int numbers[]= {55,8,66,71,23,65,2,99,54};

        System.out.println( getlargest(numbers));

    }
    
}
