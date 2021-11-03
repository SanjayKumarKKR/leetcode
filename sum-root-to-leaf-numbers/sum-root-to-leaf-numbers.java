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
    static int sum;
    public int sumNumbers(TreeNode root) {
        if(root==null){
            return 0;
        }
        sum=0;
        sumNumbersrecursive(root,0);
        return sum;
    }
      public void sumNumbersrecursive(TreeNode root, int prevdata) {
          if(root==null){
              return;
          }
          prevdata = (prevdata*10)+root.val;
          if(root.left==null && root.right==null){
              sum+=prevdata;
          }
          sumNumbersrecursive(root.left, prevdata);
          sumNumbersrecursive(root.right, prevdata);
      }
}