class Solution {
    public int maxDifference(String s) {
        int maxOddFreq = Integer.MIN_VALUE;
        int minEvenFreq = Integer.MAX_VALUE;

        int[] freq = new int[26];

        for (int i = 0; i < 26; i ++) {
            freq[i] = 0; 
        }

        for (int i = 0; i < s.length(); i ++) {
            freq[s.charAt(i) - 'a'] ++; 
        }

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if((freq[index]%2 == 0) && (freq[index] != 0)) {
                if (minEvenFreq > freq[index]) {
                    minEvenFreq = freq[index];
                }
            } else {
                if (maxOddFreq < freq[index]) {
                    maxOddFreq = freq[index];
                }
            }
        }

        return maxOddFreq - minEvenFreq;
    }
}