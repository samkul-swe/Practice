class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        int sum = 1, carry = 0, j = i+1;
        int[] answer = new int[digits.length + 1];
        while(i >= 0) {
            sum += digits[i] + carry;
            carry = sum/10;
            sum = sum%10;
            answer[j] = sum;
            sum = 0;
            i --;
            j --;
        }
        if (carry == 1) {
            answer[j] = 1;
        } else {
            int n=digits.length;
            int[] newAnswer=new int[n];
            System.arraycopy(answer,1,newAnswer,0,n);
            return newAnswer;
        }
        return answer;
    }
}