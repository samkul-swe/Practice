class Solution {
    public int minimumCost(int[] cost) {
        int costLength = cost.length ;
        if (costLength == 1) {
           return cost[0]; 
        }
        Arrays.sort(cost);
        int minCost = 0;
        for (int i = costLength - 1; i >= 1; i = i-3 ) {
            minCost += cost[i - 1] + cost[i];
        }
        int diff = costLength%3;
        if (( diff == 1) && (costLength > 3)) {
            minCost += cost[0];
        }
        return minCost;
    }
}