/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
       // return the sorted list of all nodes at k dist
        ArrayList <Integer> res =new ArrayList<>();
        HashMap<TreeNode,TreeNode> parentmap = new HashMap<>();
        parentmaps(parentmap,root);
        Queue<TreeNode> q =new LinkedList<>();
        HashSet<TreeNode> covered =new HashSet<>();
        // TreeNode t = findtarget(root,target);
        q.add(target);
        while(!q.isEmpty()){
          int size =q.size();
          for(int i=0;i<size;i++){
            TreeNode curr =q.poll();
            covered.add(curr);
            if(k==0){
                res.add(curr.val);
            }
            if(parentmap.containsKey(curr) && !covered.contains(parentmap.get(curr))){
                q.add(parentmap.get(curr));
            }
            if(curr.left!=null && !covered.contains(curr.left)){
                q.add(curr.left);
            }
            if(curr.right!=null && !covered.contains(curr.right)){
                q.add(curr.right);
            }
          }
          k--;
          if(k<0){
              return res;
          }
          
        }
        return res;
        
    }
    
    public static TreeNode findtarget(TreeNode root,int target){
        if(root!=null){
            if(root.val==target){
                return root;
            }else{
                findtarget(root.left,target);
                findtarget(root.right,target);
            }
        }
            return null;
    }
    public static void parentmaps(HashMap<TreeNode,TreeNode> parentmap, TreeNode root){
        if(root!=null){
            if(root.left!=null){
                parentmap.put(root.left,root);
            }
            if(root.right!=null){
                parentmap.put(root.right,root);
            }
            
            parentmaps(parentmap,root.left);
            parentmaps(parentmap,root.right);
            
        }
    
    }
}