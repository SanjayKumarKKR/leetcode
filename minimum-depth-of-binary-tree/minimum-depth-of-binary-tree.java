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
    int ans=Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        depth(root,1);
        return ans==Integer.MAX_VALUE?0:ans;
    }
    
    void depth(TreeNode root, int level){
        if(root==null) return;
        if(root.left==null && root.right==null){
            ans=Math.min(ans,level);
        }
        if(root.left!=null)
        depth(root.left,level+1);
        if(root.right!=null)
        depth(root.right,level+1);
    }
}