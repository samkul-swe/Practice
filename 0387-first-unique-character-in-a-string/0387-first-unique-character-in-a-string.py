class Solution:
    def firstUniqChar(self, s: str) -> int:
        uniq_char = {}
        for char in s :
            if char in uniq_char :
                uniq_char[char] = -1
            else :
                uniq_char[char] = s.index(char)
        
        for char in s :
            if uniq_char[char] != -1 :
                return uniq_char[char]
        return -1
