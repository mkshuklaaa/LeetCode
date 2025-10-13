class Solution {
    public boolean isValid(String s) {
        int n = s.length();

        Stack<Character> st = new Stack<>();

        for(int i=0;i<n;i++){
            char c = s.charAt(i);

            if(c=='(' || c=='[' || c=='{'){
                st.push(c);
            }
            else{
                if(st.isEmpty()) {
                    return false;
                }
                char topChar = st.pop();
                if(!((topChar=='(' && c==')') || (topChar=='[' && c==']') || (topChar=='{' && c=='}'))){
                    return false;
                }
            }
        }
        return st.isEmpty();
        
    }
}