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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans =new ArrayList<>();
        LinkedList<TreeNode> q =new LinkedList<>();
        if(root==null) return ans;
        q.add(root);
        int k=1;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> list =new ArrayList<>();
            k=(k==0?1:0);
            for(int i=0;i<size;i++){
                TreeNode curr;
                curr=q.poll();
                // System.out.println(curr.val);
                list.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
                
            }
            if(k==1){
                Collections.reverse(list);
                ans.add(list);
            }else{
              ans.add(list);
  
            }
        }
        return ans;
    }
}