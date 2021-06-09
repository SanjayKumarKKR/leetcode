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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        
        return symmetric(root.left,root.right);
    }
    public boolean symmetric(TreeNode left, TreeNode right){
        if(left==null && right==null){
            return true;
        }else if(left!=null && right!=null && left.val==right.val){
            return symmetric(left.right,right.left) && symmetric(right.right,left.left);
        }else{
            return false;
        }
    }
}