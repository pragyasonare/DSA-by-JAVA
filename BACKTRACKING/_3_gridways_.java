package BACKTRACKING;

public class _3_gridways_ {

     public static int gridWays(int i ,int j , int n , int m){
        //basecase
        if (i==n-1 && j==m-1){
            return 1; }//condition for last cell
         if (i>=n || j>=m){
            return 0; } // boundary cross condition
        //kaam
        int W1 = gridWays(i+1, j,n,m) ;
        int W2 = gridWays(i,j+1,n,m);
        return W1 +W2;
    }

    public static void main(String[] args) {
        int n =3;
        int m =3 ;
        System.out.println(gridWays(0,0,n,m));
    }
    
}
