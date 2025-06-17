package OOPS;

 class student{
        private int password;

        public int getpassword(){
            return password ;

        }
        public void changepassword(int newpass){
            password = newpass ;
       
        }
        // or this---------- it will have diffrent return too 
        // public int changepassword(int newpass){
        //     password = newpass ;
        //     return newpass ;
        // }

    }

public class get_set {

    public static void main(String[] args) {
        student s = new student();
      
        s.changepassword(888);
        System.out.println(s.getpassword());

        

       // System.out.println(s.changepassword(99));
        

    }

}
