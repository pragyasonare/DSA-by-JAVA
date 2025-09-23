package GREEDY;

import java.util.ArrayList;

public class Activity_selection {
     public static void main(String[] args) {
        int [ ] start = {1,3,0,5,8,5};
        int [] end = { 2,4,6,7,9,9};

        //end time basis
        int MaxAct =0;
        ArrayList<Integer> ans = new ArrayList<>();

        MaxAct =1;
        ans.add(0);
        //coz 1st activity toh krna hi padega na

        int lastend= end[0];
        //to track last activity ka end time kya tha ;
        for (int i=0 ; i<end.length; i++){
            if (start[i]>= lastend){
                //activity selected
                MaxAct++;
                ans.add(i);
                lastend = end[i];
            }
        }
        System.out.println("max activities" + " " + MaxAct);
        for (int i=0 ; i<ans.size(); i++){
            System.out.print("A"+ ans.get(i)+" ");
        }
        System.out.println();
    }
    
}
