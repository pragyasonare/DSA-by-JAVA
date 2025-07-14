public class Hashset {

     public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>() ;

        set.add(1);
        set.add(2);
        set.add(66);
        set.add(45);
        set.add(2);
        System.out.println(set);

        System.out.println(set.size());

        set.remove(66);
        System.out.println(set);


        if (set.contains(2)){
            System.out.println("contains 2");
        }

        set.clear();
        System.out.println(set + " nothing here");


        System.out.println(set.isEmpty());
    }
    
}
