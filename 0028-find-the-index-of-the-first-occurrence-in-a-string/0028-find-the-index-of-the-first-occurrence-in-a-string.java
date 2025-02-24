class Solution {
    public int strStr(String haystack, String needle) {
        int needleLength = needle.length();
        int haystackLength = haystack.length();
        int index = 0;
        int j = 0;
        for (int i = 0; i < haystackLength; i++) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                index ++;
                j ++;
            } else if (haystack.charAt(i) != needle.charAt(j) && j > 0) {
                i = i-j;
                j = 0;
                index = 0;
            }
            if (index == needleLength) {
                return i-j+1;
            }
        }
        return -1;
    }
}