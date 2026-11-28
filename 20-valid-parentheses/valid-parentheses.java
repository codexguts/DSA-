class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();

        if(n%2 != 0){
            return false;
        }

        for(int i=0; i<n; i++){
            if(s.charAt(i) == '('){
                st.push('(');
            }
            else if(s.charAt(i) == '{'){
                st.push('{');
            }
            else if(s.charAt(i) == '['){
                st.push('[');
            }
            else{
                if(!st.isEmpty() && s.charAt(i) == ')' && st.peek() == '('){
                    st.pop();
                }
                else if(!st.isEmpty() && s.charAt(i) == ']' && st.peek() == '['){
                    st.pop();
                }
                else if(!st.isEmpty() && s.charAt(i) == '}' && st.peek() == '{'){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}