package HASHMAP;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashmap {

        public static void main(String[] args) {
        LinkedHashMap<String , Integer> hm= new LinkedHashMap<>();
        hm.put("pragya" , 100);
        hm.put("gya" , 10);
        hm.put("pagya" , 190);
        hm.put("prya" , 40);
        hm.put("pgya" , 10);
        System.out.println(hm);

        // all the things will be passed inordered manner first will be first

        TreeMap<String ,Integer> tm = new TreeMap<>();
        tm.put("pragya" , 100);
        tm.put("gya" , 10);
        tm.put("pagya" , 190);
        tm.put("prya" , 40);
        tm.put("pgya" , 10);
        System.out.println(tm);

        // things will be in sorted key (alphabetical or numerical order)


    }
    
}
