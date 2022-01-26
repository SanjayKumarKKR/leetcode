// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class Node {
    int data;
    Node left;
    Node right;
} class GFG {
    public static Node createNewNode(int value) {
        Node temp = new Node();
        temp.data = value;
        temp.left = null;
        temp.right = null;
        return temp;
    }
    static   public Node newNode(Node root, int data) {
        if (root == null)
            root = createNewNode(data);
        else if (data < root.data)
            root.left = newNode(root.left, data);
        else
            root.right = newNode(root.right, data);

        return root;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while (testcases-- > 0) {
            Node root = null;
            int sizeOfArray = sc.nextInt();
            int arr[] = new int[sizeOfArray];
            for (int i = 0; i < sizeOfArray; i++) {
                int x = sc.nextInt();
                arr[i] = x;
            }

            for (int i = 0; i < sizeOfArray; i++) {
                root = newNode(root, arr[i]);
            }
            Solution g = new Solution();
            ArrayList<Integer> res = g.levelOrder(root);
            for (Integer num : res) System.out.print(num + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to return the level order traversal of a BST.
    
    static ArrayList<Integer> levelOrder(Node node) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        if(node==null){return list;}
        Queue <Node> queue =new  LinkedList<>();
        queue.add(node);
        while(queue.size()!=0){
            int size = queue.size();
            for(int i=0;i<size;i++){
                Node curr = queue.poll();
                list.add(curr.data);
                if(curr.left!=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
            }
        }
        return list;
        
    }
}