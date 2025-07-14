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
    public int maxDepth(TreeNode root) {
        // Calling the helper method to calculate the max depth
        return max(root);
    }
    
    // Helper function to compute max depth recursively
    public int max(TreeNode root){
        // If the node is null, return depth of 0
        if (root == null) {
            return 0;
        }
        
        // Recursively calculate depth of left and right subtrees
        int left = max(root.left);
        int right = max(root.right);
        
        // Return the maximum depth from both subtrees plus 1 (for the current node)
        return Math.max(left, right) + 1;
    }
}