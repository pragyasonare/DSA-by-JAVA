public class _5_pairsum {

        public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 10, 12, 15, 20};
        int target = 18;
        sum(arr,target);

    }

    public static void sum(int[] arr,int target) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] + arr[j] == target) {
                System.out.println( "1st element is " +i +" "+ "2nd element"+ j);
            }
            if ( arr[i]+ arr[j] > target){
                j--;
            }
            else {
                i++;
            }
        }
        System.out.println("not found ");
    }
    
}
