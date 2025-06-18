package OOPS;

class Ani {
    void eat() {
        System.out.println("I can eat");
    }
}

class Dog extends Ani {
    void bark() {
        System.out.println("I can bark");
    }
}

class Cat extends Ani{
    void meow() {
        System.out.println("I can meow");
    }
}

public class heriarchical_hybrid_inheritance {
     public static void main(String[] args) {
        Cat ss = new Cat();
        ss.eat();
        ss.meow();

        
    }
    
}
