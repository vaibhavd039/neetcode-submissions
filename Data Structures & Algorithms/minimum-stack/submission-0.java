class MinStack {
    Stack<Element> st;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            Element e = new Element(val, val);
            st.push(e);
        } else {
            Element e = st.peek();
            int min = Math.min(e.minValue, val);
            Element newe = new Element(min, val);
            st.push(newe);
        }
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        Element e = st.peek();
        return e.currValue;
    }
    
    public int getMin() {
         return st.peek().minValue;
    }
}

class Element{
    public int minValue;
    public int currValue;
    Element(int x, int y){
        this.minValue = x;
        this.currValue =y;
    }
}
