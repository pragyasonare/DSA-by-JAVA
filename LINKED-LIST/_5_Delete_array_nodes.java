import java.util.HashSet;
import java.util.Set;

public class _5_Delete_array_nodes {
    
     public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer>set = new HashSet<>();

        for(int n :nums){
            set.add(n);
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head ;

        ListNode curr = dummy ;
        while(curr.next != null){
            if(set.contains(curr.next.val)){
                curr.next = curr.next.next ;
            }
            else{
                curr = curr.next ;
            }
        }
        return dummy.next ;
    }
}
