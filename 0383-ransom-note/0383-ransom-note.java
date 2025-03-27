class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.contains(ransomNote)) {
            return true;
        } else {
            Map<Character,Integer> map = new HashMap<>();
            for (int i = 0; i < ransomNote.length(); i ++) {
                if (map.containsKey(ransomNote.charAt(i))) {
                    map.put(ransomNote.charAt(i),map.get(ransomNote.charAt(i)) + 1);
                } else {
                    map.put(ransomNote.charAt(i),1);
                }
            }

            for (int i = 0; i < magazine.length(); i ++) {
                if (map.containsKey(magazine.charAt(i))) {
                    map.put(magazine.charAt(i),map.get(magazine.charAt(i)) - 1);
                }
            }

            for (Map.Entry<Character,Integer> entry : map.entrySet()) {
                if (entry.getValue() <= 0) {
                    // do nothing
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}