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
    int ans=0;
    public int diameterOfBinaryTree(TreeNode root) {
        
    getdia(root);
        return ans==0?0:ans-1;
    }
    
    int getdia(TreeNode root){
        if(root==null){return 0;}
        System.out.println(ans);
        int l =getdia(root.left);
        int r =getdia(root.right);
        ans=Math.max(ans,l+r+1);
        return Math.max(l,r)+1;
    }
}