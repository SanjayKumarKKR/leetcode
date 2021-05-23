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
    ArrayList<Integer> ans;
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ans=new ArrayList<>();
        leafseq(root1,new ArrayList<>());
        ArrayList<Integer> tree1 =new ArrayList<Integer>(ans);
        ans=new ArrayList<>();
        leafseq(root2,new ArrayList<>());
        ArrayList<Integer> tree2 =new ArrayList<Integer>(ans);
        return tree1.equals(tree2);
    }
    
    void leafseq(TreeNode root,ArrayList<Integer> list){
        if(root==null){return;}
        if(root.left==null && root.right==null){
            ans.add(root.val);
            // System.out.println(ans);
            return;
        }
        if(root.left!=null)
        leafseq(root.left,new ArrayList<Integer>(list) );
        if(root.right!=null)
        leafseq(root.right,new ArrayList<Integer>(list) );
    }
}