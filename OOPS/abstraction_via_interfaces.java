package OOPS;

interface Animal {
    void legs();

    void ear();
}

interface Bat {
    void hands();
}

class humans implements Animal, Bat {
    public void legs() {
        System.out.println("Have 2 legs");
    }

    public void hands() {
        System.out.println("have 2 hands");
    }
    public void ear(){
        System.out.println("have ear");
    }
}

public class abstraction_via_interfaces {
    public static void main(String[] args) {
        humans aa = new humans();
        aa.hands();
        aa.legs();
        aa.ear();

        //interfaces object cannot be created but it can be
        Animal bb = new humans() ;
        bb.ear();
         bb.legs();

        

    }

}
