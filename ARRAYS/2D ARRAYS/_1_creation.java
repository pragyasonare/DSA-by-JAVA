import java.util.*;

public class _1_creation {
      //TO find a key or element in a 2D array
    public static boolean search(int matrix[][], int key){
        for (int i =0; i< matrix.length ; i++){
            for (int j =0 ; j< matrix[0].length ; j++){
                if (matrix[i][j] == key ){
                    System.out.println("found at cell (" + i +"," + j + ") ");
                    return  true ;
                }
            }
        }
        System.out.println("key not found ");
        return false ;
    }

    /// to create a 2d array
    public static void main(String[] args) {
        int matrix [][]= new int[3][3];
       //there are two ways ----
         int  n = matrix.length ;
         int m = matrix[0].length ;
      //  int n =3 , m =3 ;

        Scanner sc = new Scanner(System.in);
        for (int i =0; i<n ; i++){
            for (int j =0 ; j<m ; j++){
                matrix [i][j] = sc.nextInt();
            }
        }
        //output

        for (int i =0; i<n ; i++){
            for (int j =0 ; j<m ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println( );

        }
        search(matrix, 5);
    }
    
}
