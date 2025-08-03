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
        if(root==null || (root.left==null && root.right==null)) return 0;
        return 1 + Math.max(height(root.left),height(root.right));

    }

    public void nthorder1(TreeNode root,int n,List<Integer> arr){
        if(root==null) return;
        if(n==1) {
            arr.add(root.val);
            return;
        }
        nthorder1(root.left,n-1,arr);
        nthorder1(root.right,n-1,arr);
    }

    public void nthorder2(TreeNode root,int n,List<Integer> arr){
         if(root==null) return;
       if(n==1) {
            arr.add(root.val);
            return;
        }
        nthorder2(root.right,n-1,arr);
        nthorder2(root.left,n-1,arr); 
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int level = 1 + height(root);
        List<List<Integer>> list = new ArrayList<>();
        if(root==null) return list;
        
        for(int i=1;i<=level;i++){
            List<Integer> arr = new ArrayList<>(); 
            if(i%2!=0) nthorder1(root,i,arr);
            else nthorder2(root,i,arr);
            list.add(arr);
        }
        return list; 
        
    }
}