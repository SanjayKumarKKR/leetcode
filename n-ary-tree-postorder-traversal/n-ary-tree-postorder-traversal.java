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
    public List<Integer> postorder(Node root) {
        list=new ArrayList<>();
        if(root==null) {return list;}
        LinkedList <Node> s =new LinkedList<>();
        s.add(root);
        while(!s.isEmpty()){
            Node curr =s.pollLast();
            list.add(curr.val);
            int size=curr.children.size();
            for(int i=0;i<size;i++){
               s.add(curr.children.get(i));
            }
        }
        Collections.reverse(list);
        return list;
    }
   
}