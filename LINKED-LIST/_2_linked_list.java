public class _2_linked_list {

    public class _2_cycle {

    class Node2 {
    int data;
    Node2 next;

    public Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

    class LinkedList2 {
    public static Node2 head;
    public static Node2 tail;
    public  static int size;
    ///check if ll is cycle/loop
     public  static boolean isCycle(){

        Node2 slow = head ;
        Node2 fast = head ;

        while (fast!=null && fast .next!= null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if (slow == fast){
                return true; // cycle exist
            }

        }
        return false; // not exist
    }
}
    
}

    
}
