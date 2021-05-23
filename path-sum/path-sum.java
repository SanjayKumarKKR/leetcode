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
    boolean ans=false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum=0;
        pathsum(root,sum,targetSum);
        return ans;
    }
    
    void pathsum(TreeNode root,int sum,int targetSum){
        if(root==null){
            return;
        }
        if(root.val+sum==targetSum && root.left==null && root.right==null){
            ans=true;
            // System.out.println("sadasd");
            return;
        }
        if(root.left!=null)
        pathsum(root.left,sum+root.val,targetSum);
        if(root.right!=null)
        pathsum(root.right,sum+root.val,targetSum);
        
    }
}