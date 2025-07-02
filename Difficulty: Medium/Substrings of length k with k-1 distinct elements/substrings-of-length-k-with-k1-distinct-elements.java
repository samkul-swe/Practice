class Solution {
    public int substrCount(String s, int k) {
        // code here
        Set<Character> set = new HashSet<>();
        int count  = 0;
        for (int i = 0; i < s.length() - k + 1; i ++) {
            for (int j = i; j < i + k; j ++) {
                set.add(s.charAt(j));
            }
            if (set.size() == k-1) {
                count ++;
            }
            set.clear();
        }
        
        return count;
    }
}