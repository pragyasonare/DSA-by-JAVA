package HASHMAP;

import java.util.HashMap;
import java.util.Set;

public class Hashmap_2 {

     public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("India",300);
        hm.put("london",20);
        hm.put("nepal",100);
        hm.put("tydia",90);
        hm.put("In",70);
        hm.put("don",20);
        hm.put("pal",140);
        hm.put("dia",100);

        //iterate
//        Set<Integer>ps = new HashSet<>();
//        HashSet<Integer> ph = new HashSet<>()  ;

        //hm.entrySet() we can also use
        Set< String> keys = hm.keySet();
        System.out.println(keys);

        for ( String k : keys){
            System.out.println("key =" + k +", " + "value =" + hm.get(k));
        }
    }
    
}
