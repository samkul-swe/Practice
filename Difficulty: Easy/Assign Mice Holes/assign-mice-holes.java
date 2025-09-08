class Solution {
    public int assignHole(int[] mices, int[] holes) {
        // code here
        int maxTimeTaken = Integer.MIN_VALUE;
        Arrays.sort(holes);
        Arrays.sort(mices);
        for (int i = 0; i < mices.length; i++) {
            maxTimeTaken = Math.max(maxTimeTaken, Math.abs(mices[i] - holes[i]));
        }
        return maxTimeTaken;
    }
};