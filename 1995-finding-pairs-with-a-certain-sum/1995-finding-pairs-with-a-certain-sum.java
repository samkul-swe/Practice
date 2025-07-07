class FindSumPairs {

    private int[] nums1;
    private int[] nums2;
    Map<Integer,Integer> map = new HashMap<>();

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        for (int x : this.nums2) {
            this.map.put(x, map.getOrDefault(x, 0 ) + 1);
        }
    }
    
    public void add(int index, int val) {
        this.map.put(this.nums2[index], this.map.get(this.nums2[index]) - 1);
        this.nums2[index] += val;
        this.map.put(this.nums2[index], this.map.getOrDefault(this.nums2[index],0) + 1);
    }
    
    public int count(int tot) {
        int count = 0;
        for (int x : this.nums1) {
            count += this.map.getOrDefault(tot - x, 0);
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */