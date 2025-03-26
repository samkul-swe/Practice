class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] scoreCopy = new int[score.length];
       String[] result = new String[score.length];
        for (int i = 0; i < score.length; i ++) {
            scoreCopy[i] = score[i];
       }
       for (int i = 0; i < score.length; i ++) {
            for (int j = i; j < score.length; j ++) {
                if (score[i] < score[j]) {
                    int temp = score[j];
                    score[j] = score[i];
                    score[i] = temp;
                }
            }
       }
       for (int i = 0; i < score.length; i ++) {
            if (scoreCopy[i] == score[0]) {
                result[i] = "Gold Medal";
            } else if (scoreCopy[i] == score[1]) {
                result[i] = "Silver Medal";
            } else if (scoreCopy[i] == score[2]) {
                result[i] = "Bronze Medal";
            } else {
                for (int k = 2; k < score.length; k++) {
                    if(score[k] == scoreCopy[i]) {
                        result[i] = String.valueOf(k+1);
                    }
                }
            }
       }

        return result;
    }
}