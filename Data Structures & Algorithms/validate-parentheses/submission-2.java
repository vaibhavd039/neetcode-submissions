class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack<>();
        for(char x : s.toCharArray()){
            if(x=='(' || x=='{' || x=='[' ){
                st.push(x);
            } else {
                if(st.isEmpty()){
                    return false;
                }
                char y = st.pop();
                if(!isValidPair(y,x)) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    private static boolean isValidPair(char x, char y){
        return (x=='(' && y==')') ||  (x=='{' && y=='}') || (x=='[' && y==']');
    }
}
