package OOPS;

class Animal{
    void eat(){
        System.out.println("eats");
    }
}
class  mammals extends Animal{
    int legs;
    void blood(){
        System.out.println("hot blood");
    }

}
class dog extends  mammals{
    String breed;
    void bark(){
        System.out.println("bowbow");
    }
}

public class single_Inheritance {
      public static void main(String[] args) {
        dog dd= new dog();
        dd.bark();
        dd.blood();
        dd.eat();

        dd.legs =8 ;
        dd.breed = "golden retrival";
        System.out.println(dd.legs);
        System.out.println(dd.breed);

    }
    
}
