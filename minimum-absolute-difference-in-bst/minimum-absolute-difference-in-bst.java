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
    ArrayList<Integer> list;
    public int getMinimumDifference(TreeNode root) {
        list =new ArrayList<>();
        getlist(root);
        Collections.sort(list);
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++){
            if(i==0){
                diff=Math.min(diff,Math.abs(list.get(0)-list.get(1)));
            }else if(i==list.size()-1){
                diff=Math.min(diff,Math.abs(list.get(list.size()-1)-list.get(list.size()-2)));
            }else{
                diff= Math.min(diff,Math.min(Math.abs(list.get(i)-list.get(i-1)),Math.abs(list.get(i)-list.get(i+1))));
            }
        }
        return diff;
    }
    
    void getlist(TreeNode root){
        if(root==null){return;}
        list.add(root.val);
        getlist(root.left);
        getlist(root.right);
    }
}
