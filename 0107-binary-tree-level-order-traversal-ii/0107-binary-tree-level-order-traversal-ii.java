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
    public int height(TreeNode root){
        if(root==null || root.left==null && root.right==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }

    public void nlevel(List<Integer> arr,int n,TreeNode root){
        if(root==null) return;
        if(n==1) {
            arr.add(root.val);
            return;
        }
        nlevel(arr,n-1,root.left);
        nlevel(arr,n-1,root.right);
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        int level = 1 + height(root);
        List<List<Integer>> ans = new ArrayList<>();
        
        if(root==null) return ans;

        for(int i=level;i>=1;i--){
            List<Integer> arr = new ArrayList<>();
            nlevel(arr,i,root);
            ans.add(arr);
        }

        return ans;
    }
}