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
    private int nodes = 0;
    public int countNodes(TreeNode root) {
        if (root != null) {
            nodes ++;
            countNodes(root.left);
            countNodes(root.right);
        }
        return nodes;
    }
}