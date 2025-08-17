public class class_object {

        public static void main(String[] args) {
        stud ss = new stud() ;    
        ss.roll = 90 ;
        ss.name = "pragya" ;
        ss.markss = 86 ;
        ss.percentage(2, 5, 0) ;
        System.out.println(ss.percentage(4, 04, 8));

        ss.setColour("Red");
        System.out.println(ss.getcolour());


        System.out.println(ss.roll);
    }
}

    class stud {
        int roll ;
        int markss ;
        String name ;
        private String colour ;

        void setname (String naam){
            this.name = naam ;

        }

        void setColour(String col){
            this.colour = col ;
        }
        String getcolour(){
         return this.colour ;
        }

        int percentage(int a , int b , int c){
            return (a+b+c) / 3 ;
        }

        // void getname() {
        //     return this.roll ;
        // }
    }


    

