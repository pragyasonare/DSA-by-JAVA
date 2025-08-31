package STACKS;

import java.util.ArrayList;

public class _1_Stack_by_Arraylist {

    static class Stack{
        static ArrayList<Integer>list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0 ;
        }

        //PUSH
        public static void push(int data){
            list.add(data);

        }

        // POP
        public static int pop(){
            if(isEmpty()){
                return -1 ;
            }

            int top = list.size() -1 ;
            list.remove(list.size() -1) ;
            return top ;
        }

        public static int peek(){
            if(isEmpty()){
                return -1 ;
            }

            return  list.get(list.size() -1);
        }
    
    }

    public static void main(String[] args) {
        Stack s = new Stack() ;
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

          while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
    
}
