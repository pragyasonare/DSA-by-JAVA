package OOPS;
 class Animal{
        void sound(){
            System.out.println("make sound");
        }
        void eat(){
            System.out.println("eattttt");
        }
    }
   
    class cat extends Animal{
         @Override 
        void sound(){
            System.out.println("meow");
        }

         void eat(){
            super.eat();
            System.out.println("cat is eating");
        }

    }

public class method_overriding {
    public static void main(String[] args) {
        cat a = new cat();
        a.sound();
        a.eat();

        Animal aa = new Animal() ;
        aa.sound();

        //orrrrrrrrr

        Animal bb = new cat() ;
        bb.sound();

        

    }
   

    


    
}
