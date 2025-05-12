class Solution {
    public int minDeletion(String s, int k) {
        int[] count = new int[26];
        for(char c:s.toCharArray()){
            count[c-'a']++;
        }
        Arrays.sort(count);
        int ans = 0;
        for(int i = 0;i<26-k;i++)
            ans += count[i];
        return ans;
    }
}