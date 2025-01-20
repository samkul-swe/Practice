class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> charMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!(charMap.containsKey(s.charAt(i)))) {
                charMap.put(s.charAt(i),i);
            } else {
                charMap.put(s.charAt(i),-1);
            }
        }

        int leastIndex = 1000000;

        for (Map.Entry<Character,Integer> entry : charMap.entrySet()) {
            if (entry.getValue() != -1) {
               if (entry.getValue() < leastIndex) {
                    leastIndex = entry.getValue();
               } 
            }
        }
        if (leastIndex == 1000000) {
            return -1;
        }
        return leastIndex;
    }
}