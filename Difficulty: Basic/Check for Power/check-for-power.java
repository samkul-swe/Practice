//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String[] inp = read.readLine().split(" ");
            int X = Integer.parseInt(inp[0]);
            int Y = Integer.parseInt(inp[1]);

            Solution ob = new Solution();
            boolean ans = ob.isPowerOfAnother(X, Y);

            if (ans) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public boolean isPowerOfAnother(int X, int Y) {
        // code here
        if ( X == 1 && Y > 1) {
            return false;
        } else {
            if (Y == 1) {
                return true;
            } else if (X == Y) {
                return true;
            }
            int val = X;
            while (val < Y) {
                val *= X;
                if ( val == Y ) {
                    return true;
                }
            }
        }
        return false;
    }
}
