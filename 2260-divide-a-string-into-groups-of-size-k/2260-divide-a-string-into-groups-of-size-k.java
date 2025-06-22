class Solution {
    public String[] divideString(String s, int k, char fill) {
        int sLength = s.length();
        int answerLength = sLength/k;
        int rem = sLength%k;
        if (rem != 0) {
            answerLength += 1;
            rem = k - rem;
            while (rem > 0) {
                s += String.valueOf(fill);
                rem --;
            }
        }
        String[] answer = new String[answerLength];
        int m = 0;
        System.out.println(s);
        System.out.println(sLength);
        for (int i = 0; i < sLength; i += k ) {
            String temp = "";
            for (int j = i; j < i+k; j ++) {
                temp += String.valueOf(s.charAt(j));
                if (j == (i + k) - 1) {
                    answer[m] = temp;
                    m ++;
                }
            }
        }
        return answer;
    }
}