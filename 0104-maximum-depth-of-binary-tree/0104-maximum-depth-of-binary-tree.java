/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int max(int a, int b) {
        return a>b? a : b;
    }
    private int dfs(TreeNode root){
        if (root == null) {
            return 0;
        }
        return 1 + max(dfs(root.left),dfs(root.right));
    }
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + max(dfs(root.left),dfs(root.right));
    }
}