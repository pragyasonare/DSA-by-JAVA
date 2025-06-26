

import java.util.ArrayList;

public class _3_multidimensional_arraylist {
      public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainlist = new ArrayList<>();
        ArrayList <Integer>list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i=1 ; i<=5 ; i++){
            list1.add(i*1);  //12345
            list2.add(i*2);  //246810
            list3.add(i*3);  //3691215

        }
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        System.out.println(mainlist);

        //nested loops
        for (int i =0 ; i<mainlist.size(); i++){
            ArrayList<Integer>currList = mainlist.get(i);
            for (int j=0 ;j<currList.size();j++){
                System.out.print(currList.get(j)+ " ");
            }
            System.out.println();
        }
    }

    
}
