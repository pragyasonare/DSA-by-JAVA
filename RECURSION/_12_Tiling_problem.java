package RECURSION;

public class _12_Tiling_problem {

    public static int tiling_problem(int n ){
    if (n == 0 || n ==1){
        return 1;
    }
    //kaam
    //vertical choice
    int fnm1 = tiling_problem(n-1);

    //horizontal choice
    int fnm2 = tiling_problem(n-2);

    int totalways = fnm1+ fnm2;
    return  totalways;
}
    public static void main(String[] args) {
        System.out.println(tiling_problem(3));
    }

}
