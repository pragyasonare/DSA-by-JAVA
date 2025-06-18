package OOPS;

class student {
    String name ;
    int age ;


    student(String stumame , int stuage){
        this.name = stumame ;
        this.age = stuage;

    }

    void student(){
        System.out.println("name of student " + " "  +  name );
        System.out.println("age of student " + " "  +   age );
    }
}

public class constructor {
    public static void main(String[] args) {
        student ss = new student("pragya", 19);
        ss.student();
    }
    
}
