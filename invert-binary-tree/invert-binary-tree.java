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
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }
        invert(root,root.left,root.right);
        return root;
    }
    
    public void invert(TreeNode root, TreeNode left,TreeNode right){
        if(left!=null || right!=null){
        TreeNode temp = left;
        root.left=right;
        root.right=left;
        if(left!=null)
        invert(left,left.left,left.right);
        if(right!=null)
            invert(right,right.left,right.right);
        }
    }
}