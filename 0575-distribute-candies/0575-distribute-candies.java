class Solution {
    public int distributeCandies(int[] candyType) {
        int allowed = candyType.length / 2;
        Set<Integer> types = new HashSet<>();
        for (int i = 0; i < candyType.length; i ++) {
            types.add(candyType[i]);
        }

        if (types.size() > allowed) {
            return allowed;
        }
        return types.size();
    }
}