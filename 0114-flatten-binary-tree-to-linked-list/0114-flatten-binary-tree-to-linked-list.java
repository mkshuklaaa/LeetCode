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
    public void flatten(TreeNode root) {
        if(root == null) return;
        if(root.left==null && root.right==null) return;
        TreeNode left = root.left;
        TreeNode right = root.right;
        flatten(left);
        flatten(right);
        root.right = left;
        TreeNode temp = left;
        while(temp!=null && temp.right!=null) temp=temp.right;
        if(temp!=null) temp.right = right;
        else root.right = right;
        root.left = null;
    }
}