class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> stk = new Stack <>();
        int second = 0, first = 0;
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("/"))
            {
                // System.out.println(i);
                second = stk.pop();
                first = stk.pop();
                stk.push(first/second);
            }
            else if(tokens[i].equals("*"))
            {
                second = stk.pop();
                first = stk.pop();
                stk.push(first*second);
            }
            else if(tokens[i].equals("-"))
            {
                second = stk.pop();
                first = stk.pop();
                stk.push(first-second);
            }
            else if(tokens[i].equals("+"))
            {
                second = stk.pop();
                first = stk.pop();
                stk.push(first+second);
            }
            else
                stk.push(Integer.parseInt(tokens[i]));
        }
        return stk.pop();
    }
}