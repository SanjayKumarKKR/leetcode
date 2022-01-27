// { Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class PairSum {
    static Node insert(Node node, int data) {
        if (node == null) return new Node(data);

        if (node.data > data) node.left = insert(node.left, data);

        if (node.data < data) node.right = insert(node.right, data);

        return node;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int temp = 0;
            Node root = null;
            for (int i = 0; i < n; i++) {
                temp = sc.nextInt();
                root = insert(root, temp);
            }
            temp = sc.nextInt();
            if (new GFG().findPair(root, temp) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


// User function Template for Java


class GFG 
{
    //Function to check if any pair exists in BST
    //whose sum is equal to given value.
    static boolean findPair(Node root, int X) 
    {
        // Your code
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root,list);
        int st =0, end = list.size()-1;
        while(st<end){
            if(list.get(st)+list.get(end)==X){
                return true;
            }else if(list.get(st)+list.get(end)<X){
                st++;
            }else{
                end--;
            }
        }
        
        return false;
    }
    
    static void inorder(Node root, ArrayList<Integer> list){
        if(root==null){
            return;
        }
        
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
}
