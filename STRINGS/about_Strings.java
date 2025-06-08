package STRINGS;

public class about_Strings {
      public static void main(String[] args) {

        int arr[]    = {1,2,3,4,5,6} ;
        char array[] = {'a','b','c'};

        // to declare string there are two ways
        String abc = "papa mummy ";
        String str = new String("prAAAgya sonare");

        //string are immutable
        
        //for input and output
//        Scanner sc = new Scanner(System.in);
//        String name ;
      // name = sc.next(); //this just print one word
//        name = sc.nextLine() ;
//        System.out.println(name);
        System.out.println(str.toUpperCase());
        
        // to find length of string
        String myname = "Pragya sonare";
        System.out.println(myname.length());
        
        //concatenation means joining of strings
        String currentname = myname + " " + abc ;
        System.out.println(currentname);
        

        //To print all the character in a string
        System.out.println(currentname.charAt(5));
        

        for (int i=0; i<currentname.length(); i++){
            System.out.print(currentname.charAt(i)+ "  ");
        }
        System.out.println();

    }
    
}
