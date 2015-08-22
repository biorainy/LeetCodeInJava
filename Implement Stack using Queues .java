class MyStack {
    // Push element x onto stack.
    Queue<Integer> queue=new LinkedList<>();
    public void push(int x) {
        Queue<Integer> t=new LinkedList<>();
        
        while (queue.size() > 0) {
            t.add(queue.poll());
        }
        
        queue.add(x);
        
        while (t.size()>0)
            queue.add(t.poll());
        
    }

    // Removes the element on top of the stack.
    public void pop() {
        queue.poll();
    }

    // Get the top element.
    public int top() {
        return queue.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue.isEmpty();
    }
}