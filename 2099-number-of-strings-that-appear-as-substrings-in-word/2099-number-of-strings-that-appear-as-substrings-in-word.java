class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int num = 0;
        for (String pattern : patterns) {
            if (word.contains(pattern)) {
                num ++;
            }
        }
        return num;
    }
}