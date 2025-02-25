class Solution {
    public int lengthOfLastWord(String s) {
        int pointerFromBack = s.length()-1;
        int charReachedIndex = 0;
        boolean charReached = false;
        while (pointerFromBack >= 0) {
            if (s.charAt(pointerFromBack) == ' ') {
                if (charReached) {
                    return s.length() - pointerFromBack - charReachedIndex - 1; 
                } else {
                    charReachedIndex ++;
                }
            } else if (s.charAt(pointerFromBack) != ' ') {
                charReached = true;
                if (pointerFromBack == 0) {
                    return s.length() - pointerFromBack - charReachedIndex;
                }
            }
            pointerFromBack --;
        }
        return 0;
    }
}