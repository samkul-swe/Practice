class Solution {
    public int sumBase(int n, int k) {

        String s = convertbase(n, k);
        int ans = Integer.parseInt(s);
        int sum = 0;

        while(ans > 0){
            int rem = ans % 10;
            sum += rem;
            ans /= 10;
        }
        return sum;
    }
    public static String convertbase(int num, int k){
        StringBuilder result = new StringBuilder();
        if(num == 0){
            return "0";
        }
        while(num > 0){
            result.append(num % k);
            num /= k;
        }
        return result.toString();

    }
}