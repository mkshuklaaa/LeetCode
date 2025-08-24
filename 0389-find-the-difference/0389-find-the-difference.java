class Solution {
    public char findTheDifference(String s, String t) {
       char c = ' ';
       for(int i=0;i<t.length();i++) {        
        c^=t.charAt(i);
        if(i<s.length()) c^=s.charAt(i);
       }       
       return Character.toLowerCase(c);
    }
}