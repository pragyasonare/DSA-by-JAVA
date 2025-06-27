package BACKTRACKING;

public class _1_find_subset {
     public static void findssubset(String str , String ans , int i){

        //base case
        if (i == str.length()){
            if (ans.length()== 0){
                System.out.println("null");
            }else {
                System.out.println(ans);
            }
            return;
        }

        //kaam
        //yeh choice
         findssubset(str, ans+str.charAt(i), i+1);

         //no choice
        findssubset(str, ans,i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findssubset(str,"", 0);
    }
    
}
