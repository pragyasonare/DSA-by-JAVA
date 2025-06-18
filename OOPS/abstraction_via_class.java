package OOPS;

abstract  class Animal{
    abstract  void makesound() ;

    void legs(){
        System.out.println("have legs");
    }

    void colour(){
        System.out.println("have colour");

    }
}

class dog extends Animal{
    void makesound(){
        System.out.println("boww boww");
    }
    @Override 
    void legs(){
        System.out.println("have 4 legs");
    }

}

public class abstraction_via_class {
    public static void main(String[] args) {
        dog aa = new dog();
        aa.makesound();
        aa.legs();
        
        aa.colour(); //*********** */run time 
       
    }

    
}
