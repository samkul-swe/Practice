class Solution {
    public static void reverse(char[] str,int left,int right)
    {
        while(left<right)
        {
            char temp=str[left];
            str[left]=str[right];
            left++;
            str[right]=temp;
            right--;
        }
    }
    public String reverseStr(String s, int k) {
        char[] str=s.toCharArray();
        int n=str.length;
        for(int i=0;i<n;i=i+2*k)
        {
            int ending=Math.min(i+k-1,n-1);
            reverse(str,i,ending);
        }

        return new String(str);
    }
}