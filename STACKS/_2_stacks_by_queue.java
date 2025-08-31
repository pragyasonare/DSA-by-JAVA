package STACKS;

import java.util.LinkedList;
import java.util.Queue;

public class _2_stacks_by_queue {

    class MyStack {

    private Queue<Integer> q;  // class-level queue

    public MyStack() {
        q = new LinkedList<>();  // initialize queue
    }
    
    public void push(int x) {
        q.add(x);
        int size = q.size();

        // rotate so new element comes to the front
        for (int i = 0; i < size - 1; i++) {
            q.add(q.remove());
        }
    }
    
    public int pop() {
        return q.remove();  // removes front (stack's top)
    }
    
    public int top() {
        return q.peek();    // returns front (stack's top)
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

    
}
