class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for num in nums :
            val = nums.index(num)
            nums[val] = -100
            if ((target - num) in nums ) and (val != nums.index(target-num)) :
                return list((val,nums.index(target-num)))
        