class Solution {
    public String reverseVowels(String s) {
        char[] sCharArray = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if ((sCharArray[i] == 'a') || (sCharArray[i] == 'e') || (sCharArray[i] == 'i') || (sCharArray[i] == 'o') || (sCharArray[i] == 'u') || (sCharArray[i] == 'A') || (sCharArray[i] == 'E') || (sCharArray[i] == 'I') || (sCharArray[i] == 'O') || (sCharArray[i] == 'U')) {
                if ((sCharArray[j] == 'a') || (sCharArray[j] == 'e') || (sCharArray[j] == 'i') || (sCharArray[j] == 'o') || (sCharArray[j] == 'u') || (sCharArray[j] == 'A') || (sCharArray[j] == 'E') || (sCharArray[j] == 'I') || (sCharArray[j] == 'O') || (sCharArray[j] == 'U')) {
                    char temp = sCharArray[j];
                    sCharArray[j] = sCharArray[i];
                    sCharArray[i] = temp;
                    i ++;
                    j --;
                } else {
                    j --;
                }
            } else {
                i ++;
            }
        }
        return String.valueOf(sCharArray);
    }
}