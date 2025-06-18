class Solution {
    private static StringBuilder sortString(StringBuilder str, char chCase)
    {
        int[] freqArr = new int[26];
        
        if(chCase == 'L')
        {
            for(int i=0; i<str.length(); i++)
            {
                int index = str.charAt(i) - 'a';
                freqArr[index]++;
            }
            
            StringBuilder sortedStr = new StringBuilder("");

            for(int i=0; i<26; i++)
            {
                int freq = freqArr[i];
                for(int j=0; j<freq; j++)
                {
                    char ch = (char)(i+'a');
                    sortedStr.append(ch);
                }
            }
            return sortedStr;
        }
        else
        {
            for(int i=0; i<str.length(); i++)
            {
                int index = str.charAt(i) - 'A';
                freqArr[index]++;
            }
            
            StringBuilder sortedStr = new StringBuilder("");
            
            for(int i=0; i<26; i++)
            {
                int freq = freqArr[i];
                for(int j=0; j<freq; j++)
                {
                    char ch = (char)(i+'A');
                    sortedStr.append(ch);
                }
            }
            return sortedStr;            
        }
    }
    
    public static String caseSort(String s) {
        StringBuilder lower = new StringBuilder("");
        StringBuilder upper = new StringBuilder("");
        
        char[] chStr = s.toCharArray();
        
        for(int i=0; i<chStr.length; i++)
        {
            if(chStr[i] >= 'A' && chStr[i] <= 'Z')
            {
                upper.append(chStr[i]);
                chStr[i] = '#';
            }
            else
            {
                lower.append(chStr[i]);
            }
        }

        lower = sortString(lower, 'L');
        upper = sortString(upper, 'U');
        
        int j=0, k=0;
        for(int i=0; i<chStr.length; i++)
        {
            if(chStr[i] == '#')
            {
                //it is a uppercase string
                chStr[i] = upper.charAt(j);
                j++;
            }
            else
            {
                //it is a lowercase string
                chStr[i] = lower.charAt(k);
                k++;
            }
        }
        
        return String.valueOf(chStr);
        
    }
}