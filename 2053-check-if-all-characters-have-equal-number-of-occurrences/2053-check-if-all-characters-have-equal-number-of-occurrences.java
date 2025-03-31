class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];
        for(int i = 0; i < 26; i++) {
            freq[i] = 0;
        }

        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        int someNum = -1;
        for(int i=0; i< 26; i++) {
           if (freq[i] != 0 && someNum == -1) {
            someNum = freq[i];
           } else if (freq[i] != 0 && someNum != -1) {
            if (freq[i] != someNum) {
                return false;
            }
           }
        }

        return true;
    }
}