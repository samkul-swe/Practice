class Solution {
    public int findLength(int[] color, int[] radius) {
        // code here
        int numOfBalls = color.length;
        Stack<Map<Integer,Integer>> stack = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();
        map.put(color[0],radius[0]);
        stack.push(map);
        for (int i = 1; i < color.length; i++) {
            Map<Integer,Integer> newMap = new HashMap<>();
            newMap.put(color[i],radius[i]);
            if (stack.size() > 0) {
                Map<Integer,Integer> prevMap = stack.pop();
                if (prevMap.equals(newMap)) {
                    // do nothing
                } else {
                    stack.push(prevMap);
                    stack.push(newMap);
                }
            } else {
                stack.push(newMap);
            }
        }
        return stack.size();
    }
}