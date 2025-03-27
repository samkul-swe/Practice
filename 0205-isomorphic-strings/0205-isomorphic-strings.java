class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        } else {
            Map<Character,Character> map = new HashMap<>();
            for (int i = 0; i < s.length(); i ++) {
                if (map.containsKey(s.charAt(i))) {
                    if (map.get(s.charAt(i)) == t.charAt(i)) {
                        // continue
                    } else {
                        return false;
                    }         
                } else {
                    map.put(s.charAt(i),t.charAt(i));
                }
            }

            map.clear();
            for (int i = 0; i < t.length(); i ++) {
                if (map.containsKey(t.charAt(i))) {
                    if (map.get(t.charAt(i)) == s.charAt(i)) {
                        // continue
                    } else {
                        return false;
                    }         
                } else {
                    map.put(t.charAt(i),s.charAt(i));
                }
            }

            return true;
        }
    }
}