package OOPS; 


//class for pen
class pen{
    String  colour;
    int tip ;

    void setColour( String newColour) {
        colour = newColour ;
    }
    void setTip( int newTip){
        tip = newTip;
    }
}

//class for student
class student{
    String name ;
    int rollno ;
    int percentage ;

    int setPercentage(int math , int bio , int eng){
         this. percentage = ( math+eng+bio)/3 ;
         return this. percentage ;
  }
}
class account {
    public String name ;
    private int password;

    void setPassword(int pwd){
       this.password = pwd ;  //or  password = pwd ;
    }
    int getpassword(){
        return this.password ;
    }


}


public class class_object {
    public static void main(String[] args) {

        pen pp = new pen();
       pp.setColour("pink");
       System.out.println(pp.colour);

    //    student s = new student();
    //   // s.setPercentage(20,50,60);
    //    System.out.println(s.setPercentage(2,4,5));
       
    }
    
}
