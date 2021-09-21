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
    
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null){return 0;}
        Queue<TreeNode> q =new LinkedList<>();
        q.add(root);
        int sum=0;
        while(q.size()!=0){
            int size=q.size();
            int f=0;
            for(int i=0;i<size;i++){
                TreeNode node = q.poll();
                if(node==null){continue;}
                if(node.left==null && node.right==null && f==0 && node!=root && i%2==0){
                    sum+=node.val;
                    // f=1;
                }
                q.add(node.left);
                q.add(node.right);
            }
            f=0;
        }
        return sum;
    }
}