class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        char_set = set()
        max_length = 0
        left = 0
        for right in range(len(s)) :
            if s[right] in char_set :
                while s[left] != s[right] :
                    char_set.remove(s[left])
                    left+=1
                char_set.remove(s[left])
                left+=1
                char_set.add(s[right])
            else :
                char_set.add(s[right])
                max_length = max(max_length,right-left+1)
        return max_length
        