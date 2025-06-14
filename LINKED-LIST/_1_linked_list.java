

public class _1_linked_list {
     class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    class LinkedList {
        public static Node head;
        public static Node tail;
        public  static int size;


//////////adding first in linked list------------------

        public void addFirst(int data) {
            // 1)))))create new node
            Node newnode = new Node(data);
            size++;
            ///h=is head is null mtlb ll is empty
            if (head == null) {
                head = tail = newnode;
                return;
            }
            // 2)))))) new node should point next head
            newnode.next = head; // linking step
            // 3))) head = newNode
            head = newnode;
        }
        ///////////adding last in linked list
        public void addLast(int data) {
            //1
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
                return;
            }


            //2
            tail.next = newNode;
            //3
            tail = newNode;

        }

        // to print a Linked list---------------
        public void print() {

            if (head == null) {
                System.out.println("ll is empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println();
        }
// to add in middle of ll
         public void addInmiddle(int idx, int data){
            if (idx== 0){
                addFirst(data);
                return;
            }
            Node newnode = new Node(data);
            size++;
            Node temp = head;
            int i =0 ;

            while(i<idx-1){
                temp = temp.next;
                i++;
            }
            // when i= idx-1 ; temp -> prev
             newnode.next = temp.next; //3->4
            temp.next = newnode;       //2->3

         }

         public int removeFirst(){
            //speacial case - if ll is empty
            if (size==0){
                System.out.println("ll is empty");
                return Integer.MIN_VALUE;
            }
            //if ll size = 1
             else if (size==1){
                 int value = head.data;
                 head = tail= null;
                 size =0 ;
                 return value;
            }

            int value = head.data;
            head = head.next;
            size--;
            return value;
         }

         public int removeLast(){
             //speacial case - if ll is empty
             if (size==0){
                 System.out.println("ll is empty");
                 return Integer.MIN_VALUE;
             }
             //if ll size = 1
             else if (size==1){
                 int value = head.data;
                 head = tail= null;
                 size =0 ;
                 return value;
             }
             //prev = size -2 (coz we want to go to secound last node)
              Node prev = head;
             for (int i =0; i<size-2 ;i++){
                 prev = prev.next;
             }
             int value = prev.next.data;
             prev.next = null;
             tail= prev;
             size--;
             return value;
         }
 ///search in ll  ---------------------------------------------
         public int iterativeSearch(int key){
            Node temp = head ;
            int i =0 ;
            while (temp!=null){
                if (temp.data == key){
                    return i;
                }
                temp = temp.next;
                i++;
            }
             return -1;
         }
// to reverse ll-----------------
         public  void reverse(){
            Node prev = null;
            Node curr = tail = head;
            Node next;

            while (curr!=null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
         }
// remove node  Nth  form last
         public void RemoveNthFromLast(int n ){
            //first we hava to calculate the size of ll
            int sz=0;
            Node temp = head ;
            while (temp!=null){
                temp = temp.next;
                sz++;
            }
            //if the node that we have to delete is the first one ---
             if (n == sz){
                 head = head.next ;
             }
             int i = 1;
             int iToFind = sz-n;
             Node prev = head;
             while (i < iToFind) {
                 prev = prev.next;
                 i++;
             }
             prev.next= prev.next.next;
             return;
         }


         //also u can learn
         int getKthFromLast(Node head, int k) {
             Node dumb = new Node(0);
             Node slow = head ;
             Node fast = head ;

             for(int i=0 ; i<=k ; i++){
                 fast= fast.next;
             }

             while(fast!= null){
                 slow= slow.next;
                 fast= fast.next;
             }

             slow.next =  slow.next.next;
             return slow.data ;


         }

        //check if the ll is palindromic
         public Node findNode(Node head){ // node is return type
            Node slow = head ;
            Node fast = head;

            while (fast!= null && fast .next!= null ){
                slow = slow.next;       //+1
                fast = fast.next.next;  //+2
            }
            return slow; // slow is midNode
         }

         public  boolean checkPalindrome(){
            if (head == null || head.next== null){
                return  true;
            }
            //step 1 = find mid
             Node midNode = findNode(head);

             //step 2 = reverse the half
             Node prev = null;
             Node curr = midNode;
             Node next ;

             while (curr!= null){
                 next = curr.next;
                 curr.next = prev;
                 prev = curr;
                 curr = next ;
             }
             Node right = prev ;
             Node left  = head ;

             //step 3 = check 1 amd 2 half (left and right)
             while (right!= null){
                  if (left.data!= right.data){
                      return  false;
                  }
                  left = left.next ;
                  right = right.next;

             }
             return  true;

         }



    }
    
}
