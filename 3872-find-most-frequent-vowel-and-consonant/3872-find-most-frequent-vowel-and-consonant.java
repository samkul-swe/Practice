class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < 26; i++) {
            freq[i] = 0;
        }
        for (int i = 0; i < s.length(); i ++) {
            freq[s.charAt(i) - 'a'] ++;
        }

        String vowels = "aeiou";
        int maxVowel = 0;
        int maxConsonant = 0;
        for (int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            if (vowels.contains(String.valueOf(c))) {
                maxVowel = Math.max(maxVowel, freq[c - 'a']);
            } else {
                maxConsonant = Math.max(maxConsonant, freq[c - 'a']);
            }
        }

        return maxVowel + maxConsonant;
    }
}