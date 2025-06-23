package ARRAYLIST;

import java.util.ArrayList;

public class _1_arraylist {

     public static void main(String[] args) {
        //declare a array list
        //classname<datatype>objectname = new classname<>();
        ArrayList<Integer>list = new ArrayList<>();
        ArrayList<String>list2 = new ArrayList<>();
        ArrayList<Boolean>list3 = new ArrayList<>();


        ///operation in arraylist
        //add
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        //or
       // list.add(2,99); --- this will shift the element order
        System.out.println(list);

        //to get element
       int elle = list.get(2);
        System.out.println(elle);

        //remove element
        list.remove(2);
        System.out.println(list);

        //set element at index
        list.set(3,55);
        System.out.println(list);

        // check if it contains the element
        System.out.println(list.contains(2));
        System.out.println(list.contains(66));

        //size  is a method/function not a property
        System.out.println(list.size());

        System.out.println("***************");

        //print the arraylist
        for (int i =0 ; i<list.size(); i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println("***********");

       // print reverse
//        for (int i = list.size()-1 ; i>=0 ; i--){
//            System.out.println(list.get(i));
//        }


        //print the maximum num
        int max = Integer.MIN_VALUE;
        for (int i =0 ; i<list.size();i++){
            if (max < list.get(i)) {
                max = list.get(i);

                //or u can use a single line
                max = Math.max(max,list.get(i));
            }
        }
        System.out.println("max element is " + max);


        //swapping of element from given indexes





    }
    

    
}
