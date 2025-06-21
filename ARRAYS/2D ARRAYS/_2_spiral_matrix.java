

public class _2_spiral_matrix {
      public static void printSpiral(int matrix[][]){
        int t = 0;
        int b = matrix.length - 1;
        int l = 0;
        int r = matrix[0].length - 1;

        int direction = 0;
        while (t <= b && l <= r) {

            if (direction == 0) {
                for (int i = l; i <= r; i++) {
                    System.out.println(matrix[t][i]);

                }
                t++;
            }

            if (direction == 1) {
                for (int i = t; i <= b; i++) {
                    System.out.println(matrix[i][r]);

                }
                r--;
            }

            if (direction == 2) {
                for (int i = r; i >= l; i--) {
                    System.out.println(matrix[b][i]);

                }
                b--;
            }

            if (direction == 3) {
                for (int i = b; i >= t; i--) {
                    System.out.println(matrix[i][l]);
                }
                l++;
            }
            direction = (direction + 1) % 4;
        }

    }
    public static void main(String[] args){
        int matrix[][]={{1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}};
        printSpiral(matrix);
        }

    
}
