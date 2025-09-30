public class _4_Remove_Nodes_From{
       public ListNode removeNodes(ListNode head) {

        head = reverse(head);

        ListNode dummy = new ListNode(0);
        ListNode curr = head ;
        ListNode prev = dummy ;
        int max = Integer.MIN_VALUE ;

        while(curr != null){
            if(curr.val >= max){
                max = curr.val ;
                prev.next = curr ;
                prev = curr ;
            }
            curr = curr.next ;
        }

        prev.next = null ;

        return reverse(dummy.next);

    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head ;
        ListNode next ;

        while(curr != null){
            next = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = next ;
        }
        return prev ;
    }
}
