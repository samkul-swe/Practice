class Solution {
    public String convert(String s, int numRows) {
        if (s.length() == 1 || numRows == 1) {
            return s;
        }
        int value = (numRows*2) - 2;
        int valueDiff, overHeadDiff,count;
        String answer = "";
        for (int i = 0; i<numRows; i++) {
            valueDiff = value - i;
            count = i;
            overHeadDiff = valueDiff - count;
            boolean turn = true;
            while (count < s.length()) {
                answer += s.charAt(count);
                if (turn && valueDiff != overHeadDiff && overHeadDiff != 0) {
                    count += overHeadDiff;
                } else if (!turn && valueDiff != overHeadDiff && overHeadDiff != 0) {
                    count += value - overHeadDiff;
                } else if (valueDiff != overHeadDiff && overHeadDiff == 0) {
                    while ((count+valueDiff)%value == 0) {
                        count += valueDiff;
                    }
                    count += valueDiff;
                } else if (valueDiff == overHeadDiff && overHeadDiff != 0) {
                    if (i == 0) {
                        count += overHeadDiff;
                    } else if (i == numRows -1) {
                        while ((count+valueDiff)%value == 0) {
                            count += valueDiff;
                        }
                        count += valueDiff;
                    }
                }
                turn = !turn;
            }
        }
        return answer;
    }
}