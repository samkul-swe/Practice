//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());

        Solution solution = new Solution();
        while (t-- > 0) {
            String input = reader.readLine().trim();
            String[] parts = input.split("\\s+");
            int[] arr = Arrays.stream(parts).mapToInt(Integer::parseInt).toArray();

            System.out.println(solution.findMissing(arr));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findMissing(int[] arr) {
        // code here
        int diff = arr[1] - arr[0];
        if (arr.length == 2) {
            return arr[1] + diff;
        } else {
            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i+1] - arr[i] > diff) {
                    return arr[i] + diff;
                }
            }
        }
        return arr[arr.length - 1] + diff;
    }
}
