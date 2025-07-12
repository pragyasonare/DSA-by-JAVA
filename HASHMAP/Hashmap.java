public class Hashmap {

      public static void main(String[] args) {
        HashMap<String , Integer> hm = new HashMap<>();

        //insert
        hm.put("India",300);
        hm.put("london",20);
        hm.put("nepal",100);
        hm.put("tydia",90);
        System.out.println(hm);

        //get -search for what u asked for
         int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("srilanka")); //null

        //containskey(key) - returns true and false if  a key exist or not
        System.out.println(hm.containsKey("India"));


        //remove -(key,value) or (key)
        System.out.println( hm.remove("tydia"));  // this will return the value of key that is deleted
        System.out.println(hm);


        //size
        System.out.println(hm.size());

        //Isempty - t/f
        System.out.println(hm.isEmpty());  //false

        // clear - clear all hashmap
        hm.clear();
        System.out.println(hm.isEmpty());


    }
    
}
