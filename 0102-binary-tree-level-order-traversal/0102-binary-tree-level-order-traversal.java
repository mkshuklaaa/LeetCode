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
        return 1+ Math.max(height(root.left),height(root.right));
    }
    public void nlevel(TreeNode root,int n,List<Integer> arr){
        if(root == null) return;
        if(n==1) {
            arr.add(root.val);
            return;
        }

        nlevel(root.left,n-1,arr);
        nlevel(root.right,n-1,arr);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        int level = 1+height(root);
        if(root ==null) return list;
        

        for(int i=1;i<=level;i++){
            List<Integer> arr = new ArrayList<>();
            nlevel(root,i,arr);
            list.add(arr);
        }
        return list;

        
    }
}