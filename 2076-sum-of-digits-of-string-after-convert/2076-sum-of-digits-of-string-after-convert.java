class Solution {
    public int getLucky(String s, int k) {
        String sNum = "";
        int sum = 0;
        int sNumber = 0;

        for (int i = 0; i < s.length(); i++) {
            sNum += s.charAt(i) - 'a' + 1;
            sNumber = Integer.parseInt(sNum);
            while (sNumber != 0 ) {
                sum += sNumber%10;
                sNumber /= 10;
            }
            sNum = "";
        }
        sNumber = sum;
        k--;
        
        while (k > 0) {
            sum = 0;
            while(sNumber != 0) {
                sum += sNumber%10;
                sNumber /= 10;
            }
            k--;
            sNumber = sum;
        }

        return sum;
    }
}