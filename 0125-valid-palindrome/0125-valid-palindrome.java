class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        s = s.toLowerCase();
        while (i < j) {
            System.out.println(s.charAt(i) + " " +  s.charAt(j));
            if (s.charAt(i) == s.charAt(j)) {
                i ++;
                j --;
            } else if (s.charAt(i) == ' ' || s.charAt(i) == ',' || s.charAt(i) == ':' || s.charAt(i) == '.' || s.charAt(i) == '@' || s.charAt(i) == '#' || s.charAt(i) == '_' || s.charAt(i) == '\'' || s.charAt(i) == '{' || s.charAt(i) == '}' || s.charAt(i) == '\"' || s.charAt(i) == '[' || s.charAt(i) == ']' || s.charAt(i) == '-' || s.charAt(i) == '?' || s.charAt(i) == ';' || s.charAt(i) == '!' || s.charAt(i) == '\\' || s.charAt(i) == ')' || s.charAt(i) == '(' || s.charAt(i) == '`') {
                i ++;
            } else if (s.charAt(j) == ' ' || s.charAt(j) == ',' || s.charAt(j) == ':' || s.charAt(j) == '.' || s.charAt(j) == '@' || s.charAt(j) == '#' || s.charAt(j) == '_' || s.charAt(j) == '\'' || s.charAt(j) == '{' || s.charAt(j) == '}' || s.charAt(j) == '\"' || s.charAt(j) == '[' || s.charAt(j) == ']' || s.charAt(j) == '-' || s.charAt(j) == '?' || s.charAt(j) == ';' || s.charAt(j) == '!' || s.charAt(j) == '\\' || s.charAt(j) == ')' || s.charAt(j) == '(' || s.charAt(j) == '`') {
                j --;
            } else if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        
        return true;
    }
}