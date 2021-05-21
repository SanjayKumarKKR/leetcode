/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> list;
    public List<Integer> preorder(Node root) {
        list=new ArrayList<>();
        if(root==null) {return list;}
        order(root);
        return list;
    }
    public void order(Node root){
        Stack <Node> s =new Stack<>();
        s.add(root);
        while(!s.isEmpty()){
            Node curr =s.pop();
            list.add(curr.val);
            int size=curr.children.size();
            for(int i=size-1;i>=0;i--){
                s.push(curr.children.get(i));
            }
            
        }
    }
}