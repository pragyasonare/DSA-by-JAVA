package ARRAYLIST;

import java.util.ArrayList;
import java.util.Collections;

public class _2_swap_arraylist {
      public static void swap (ArrayList<Integer>list, int idx1 , int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

//        int idx1 = 1 ; //this are index
//        int idx2 = 3;
//        System.out.println(list);
//        swap(list,idx1,idx2);
//        System.out.println(list);

        //to sort an array list = Ascending order
        System.out.println(list);
        Collections.sort(list);  //built in function
        System.out.println(list);

        //to sort an array list = decending order
        Collections.sort(list,Collections.reverseOrder());
        //comparator - function in java  that define logic for sorting kese honi chahiye --u can apply in objects to
        System.out.println(list);
    }
    
}
