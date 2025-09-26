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
    static TreeNode ans = null;
    public void helper(TreeNode root,int val){
        if(root==null) return;
        if(root.val==val){
            ans = root;
            return;
        }

        helper(root.left,val);
        helper(root.right,val);

    }
    public TreeNode searchBST(TreeNode root, int val) {
        helper(root,val);
        TreeNode temp = ans;
        ans = null;
        return temp ;
    }
}