package STRINGS;

public class _3_largest_string {
     public static void main(String[] args) {
        String fruits[] = {"apple " , "banana" , "mango"};
        String largest = fruits[0];
        for (int i =0 ; i<fruits.length ; i++){
            if ( largest .compareTo(fruits[i]) < 0){
                //here compareTo. in function which compare string
                //if string equal then = 0
                //if str1 <str2 = <0 
                //if str1 >str2 = >0
                largest = fruits[i];
            }
        }
        System.out.println(largest );
    }
    
    
}
