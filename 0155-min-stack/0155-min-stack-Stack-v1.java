class MinStack {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> mst = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int value) {
        st.push(value);

        if(mst.isEmpty() || value <= mst.peek()){
            mst.push(value);
        }
    }
    
    public void pop() {
        if(st.peek().equals(mst.peek())){
            mst.pop();
        }

        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return mst.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */