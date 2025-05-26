class Solution {
    public int longestPalindrome(String[] words) {
        Map<String,Integer> map = new HashMap<>();
        int answer = 0;
        boolean hasCentralWord = false;

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String word : map.keySet()) {
            int freq = map.get(word);

            String reversed = new StringBuilder(word).reverse().toString();
            if (word.equals(reversed)) {
                answer += (freq/2) * 4;
                if (freq % 2 == 1) {
                    hasCentralWord = true;
                }
            } else if (map.containsKey(reversed)) {
                int pairs = Math.min(freq, map.get(reversed));
                answer += pairs * 4;
                map.put(reversed, 0);
            }
            map.put(word, 0);
        }

        if (hasCentralWord) answer += 2;
        return answer;
    }
}