class Solution {
    public String addBinary(String a, String b) {
        int n = 0, k = 0;
        int diff;
        if (a.length() > b.length()) {
            n = a.length();
            diff = a.length() - b.length();
            while (diff > 0) {
                b = "0" + b;
                diff--;
            }

        } else {
            n = b.length();
            diff = b.length() - a.length();
            while (diff > 0) {
                a = "0" + a;
                diff--;
            }
        }
        k = n - 1;
        String[] answer = new String[n+1];
        boolean carry = false;
        
        while (k >= 0) {
            if (a.charAt(k) == '1') {
                if (carry) {
                    if (b.charAt(k) == '0') {
                        answer[k] = "0";
                        carry = true;
                    } else {
                        answer[k] = "1";
                        carry = true;
                    }
                } else {
                    if (b.charAt(k) == '1') {
                        answer[k] = "0";
                        carry = true;
                    } else {
                       answer[k] = "1"; 
                       carry = false;
                    }
                }
            } else {
                if (carry) {
                    if (b.charAt(k) == '0') {
                        answer[k] = "1";
                        carry = false;
                    } else {
                        answer[k] = "0";
                        carry = true;
                    }
                } else {
                    if (b.charAt(k) == '1') {
                        answer[k] = "1";
                        carry = false;
                    } else {
                       answer[k] = "0";
                       carry = false; 
                    }
                }
            }
            k--;
        }

        String answerString = "";
        for (String c : answer) {
            if (c != null) {
                answerString += c;
            }
        }
        if (carry) {
            answerString = "1" + answerString;
        }
        return answerString;
    }
}