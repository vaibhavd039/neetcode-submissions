class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String s : tokens) {
            if (s.equals("+") || s.equals("-") ||
                s.equals("*") || s.equals("/")) {

                int a = st.pop();
                int b = st.pop();
                st.push(operate(a, b, s));

            } else {
                st.push(Integer.parseInt(s));
            }
        }

        return st.pop();
    }

    private int operate(int a, int b, String x) {
        switch (x) {
            case "+":
                return b + a;
            case "-":
                return b - a;
            case "*":
                return b * a;
            case "/":
                return b / a;
        }
        return -1;
    }
}