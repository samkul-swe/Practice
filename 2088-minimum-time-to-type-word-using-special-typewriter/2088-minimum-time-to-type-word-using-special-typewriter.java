class Solution {
    public int minTimeToType(String word) {
        int totalTime = 0;
        char lastChar = 'a';
        for (int i = 0; i < word.length(); i ++) {
            int timeToTurn = Math.abs(word.charAt(i) - lastChar) > 26 - Math.abs(word.charAt(i) - lastChar)? 26 - Math.abs(word.charAt(i) - lastChar) : Math.abs(word.charAt(i) - lastChar);
            int timeToType = 1;
            totalTime += timeToTurn + timeToType;
            lastChar = word.charAt(i);
        }
        return totalTime;
    }
}