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
    int diff=0;
    public int findTilt(TreeNode root) {
        helper(root);
        return diff;
    }
    
    int helper(TreeNode root){
        if(root==null)return 0;
        if(root.left==null && root.right==null)return root.val;
        
        int left = helper(root.left);
        int right =helper(root.right);
        // System.out.println(root.val+" "+left+" "+right+" ");
        diff+=Math.abs(left-right);
        return left+right+root.val;
    }
}