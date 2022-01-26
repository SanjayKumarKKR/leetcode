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
    // List<TreeNode> list ;
    TreeNode curr;
    public TreeNode increasingBST(TreeNode root) {
        if(root==null){return null;}
        // list = new ArrayList<>();
        TreeNode res = new TreeNode(0);
        curr = res;
        inorder(root);
        return res.right;
        // for(int i=0;i<list.size()-1;i++){
        //     list.get(i).right=list.get(i+1);
        //     list.get(i).left =null;
        // }
        // list.get(list.size()-1).right=null;
        // list.get(list.size()-1).left =null;
        // return list.get(0);
    }
    
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }        
        
        inorder(root.left);
        // list.add(root);
        curr.right = root;
        root.left =null;
        curr = root;
        inorder(root.right);
    }
}