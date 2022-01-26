// { Driver Code Starts
// Initial Template for Java

// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Node {
    int data;
    Node left;
    Node right;
}

class GFG {
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
            Tree g = new Tree();
            ArrayList<Integer> res = g.inOrder(root);
            for (int i = 0; i < res.size(); i++)
                System.out.print(res.get(i) + " ");
            System.out.print("\n");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Tree {
    // Function to return a list containing the inorder traversal of the BST.
    ArrayList<Integer> list;
    ArrayList<Integer> inOrder(Node root) {
        // code here
        list = new ArrayList<>();
        helper(root);
        return list;
    }
    
    void helper(Node root){
        if(root==null){
            return ;
        }
        helper(root.left);
        list.add(root.data);
        helper(root.right);
    }
}