class Solution {
    public String pushDominoes(String dominoes) {
        int len = dominoes.length();
        int[] left = new int[len];
        int[] right = new int[len];
        for(int i=0, lastR = -1;i<len;i++) {
            if(dominoes.charAt(i)=='R') {
                lastR = i;
            } else if(dominoes.charAt(i)=='L'){
                lastR = -1;
            } else {
                if(lastR!=-1) right[i] = i-lastR;
            }
        }
        for(int i=len-1, lastL = len;i>=0;i--) {
            if(dominoes.charAt(i)=='L') {
                lastL = i;
            } else if(dominoes.charAt(i)=='R') {
                lastL = len;
            } else {
                if(lastL!=len) left[i] = lastL-i;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<len;i++) {
            char cur = dominoes.charAt(i);
            if(cur=='L') sb.append("L");
            else if(cur=='R') sb.append("R");
            else {
                if(right[i]==0 && left[i]!=0) sb.append("L");
                else if(left[i]==0 && right[i]!=0) sb.append("R");
                else if(right[i]<left[i]) sb.append("R");
                else if(right[i]>left[i]) sb.append("L");
                else sb.append(".");
            }
        }
        return sb.toString();
    }
}