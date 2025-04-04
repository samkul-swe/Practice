class Solution {
    public String reversePrefix(String word, char ch) {
        // find the first occurence
        int finalIndex = word.indexOf(ch);
        if (finalIndex == -1) {
            return word;
        }
        // reverse everthing till that index in place
        char[] wordCharArray = word.toCharArray();
        int i = 0;
        int len = (finalIndex - i)/2;
        while (i <= len) {
            char temp = wordCharArray[i];
            wordCharArray[i] = wordCharArray[finalIndex];
            wordCharArray[finalIndex] = temp;
            i++;
            finalIndex --;
        }
        return String.valueOf(wordCharArray);
    }
}