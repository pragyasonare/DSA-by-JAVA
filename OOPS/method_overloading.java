package OOPS;

class calculator{
    int add(int a, int b){
        return a+b ;
    }

    double add(double a , double b){
        return a+b;
    }
}

public class method_overloading {
    public static void main(String[] args) {
        calculator c = new calculator() ;
       System.out.println(c.add(2, 03));

    }


    
}
