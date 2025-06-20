//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine();
            String[] S = s.split(" ");
            int x1 = Integer.parseInt(S[0]); 
            int y1 = Integer.parseInt(S[1]); 
            int x2 = Integer.parseInt(S[2]); 
            int y2 = Integer.parseInt(S[3]);            
            Solution ob = new Solution();
            int ans = ob.distance(x1, y1, x2, y2);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int distance(int x1, int y1, int x2, int y2) {
        // Code here
        return (int) Math.round(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }
}