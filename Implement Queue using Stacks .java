class MyQueue {
    // Push element x to the back of queue.
    public Stack<Integer> s = new Stack<>();
    public void push(int x) {
        Stack<Integer> t = new Stack<>();
        
        while (!s.isEmpty()) {
            t.push(s.pop());
        }
        
        s.push(x);
        
        while(!t.isEmpty()) {
            s.push(t.pop());
        }
    }

    // Removes the element from in front of queue.
    public void pop() {
       s.pop();
    }

    // Get the front element.
    public int peek() {
        return s.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return s.isEmpty();
    }
}