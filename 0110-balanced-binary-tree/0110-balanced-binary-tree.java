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
    public boolean isBalanced(TreeNode root) {
        if(height(root) != -1){
            return true;
        }else{
            return false;
        }
    }
    private static int height(TreeNode node){
        if(node == null) return 0;

        int lh = height(node.left);
        int rh = height(node.right);
        if(lh == -1 || rh == -1) return -1;
        if(Math.abs(lh-rh) > 1) return -1;

        return 1 + Math.max(lh,rh);
    }
}