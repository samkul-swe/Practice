class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        Map<Character,Integer> map = new HashMap<>();
        int left = 0;
        int maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            map.put(rightChar,map.getOrDefault(rightChar,0) + 1);
            if (map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left ++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        if (map.size() < k) {
            return -1;
        }
        return maxLen;
    }
}