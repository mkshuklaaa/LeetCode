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
    int count=0;
    public void helper(TreeNode root, long sum){
        if(root==null) return;
        if(root.val==sum) count++;
        helper(root.left,(long)sum-root.val);
        helper(root.right,(long) sum-root.val);
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        helper(root,targetSum);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);
        return count;       
        
    }
}