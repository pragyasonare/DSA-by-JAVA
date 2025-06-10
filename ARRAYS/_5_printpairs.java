package ARRAYS;

public class _5_printpairs {
        public static void printpairs(int numbers[]){
        for(int i =0 ; i<numbers.length ; i++){
          //  int curr = numbers[i];
            for(int j = i+1 ; j<numbers.length ; j++){
                System.out.print("(" + numbers[i] + ", " + numbers[j] + ")" + "  ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int numbers[] = { 2,4,6,8,10};
        printpairs(numbers);
    }
    
}
