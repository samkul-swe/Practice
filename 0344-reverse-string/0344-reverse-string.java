class Solution {
    public void reverseString(char[] s) {
        int i = 0, j = s.length - 1;
        while ((i <= s.length/2) && (j >= s.length/2)) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            j --;
            i ++;
        }
    }
}