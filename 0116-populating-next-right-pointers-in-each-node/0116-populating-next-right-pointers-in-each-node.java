/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;
    // ... constructors
};
*/
class Solution {
    public Node connect(Node root) {
       if(root==null) return null;

       Queue<Node> q = new LinkedList<>();
       q.add(root);

       while(!q.isEmpty()){
        int size = q.size();        
        for(int i=0;i<size;i++){
            Node currNode = q.poll();
            if(i<size-1) currNode.next = q.peek();
            if(currNode.left!=null) q.add(currNode.left);
            if(currNode.right!=null) q.add(currNode.right);
        }
       }return root;
    }
}