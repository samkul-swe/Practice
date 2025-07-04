class Solution {
    public int possibleStringCount(String word) {
        int count = 0;
        for (int right = word.length() - 1; right > 0; right--) {
            if (word.charAt(right) == word.charAt(right - 1)) {
                count ++;
            }
        }
        return count + 1;
    }
}