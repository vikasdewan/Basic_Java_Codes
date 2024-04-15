import java.util.*;
public class BST {


    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }


    }

    //time complexcity of insert is : O(H),where H is the height of the tree.
    public static Node insert(Node root ,int val) {
        if(root == null ) {
            root = new Node(val) ;
            return root;
        }
        if(root.data > val ) {
            //left subtree
            root.left = insert(root.left,val);
        }

        else {
            //right subtree
            root.right = insert(root.right, val);
        }

        return root;
    }

public static void inorder(Node root) {
    if(root == null) {
        return;
    }
    inorder(root.left) ;
    System.out.print(root.data + " ");
    inorder(root.right);
}

//search fucntion
    public static boolean search(Node root , int key) {
        if(root == null) {
            return false;
        }
        if(root.data >key ){
            //left subtree
            return search(root.left ,key);
        }
        else if ( root.data == key) {
            return true;
        }
        else {
            return search(root.right, key);
        }

    }

    //delete the Node from the tree.
    public static Node delete(Node root, int val) {
        if(root.data > val) {
           root.left  =  delete(root.left,val);
        }
        else if(root.data < val){
           root.right =  delete(root.right , val);
        }
        else  {  //root.data == val
            //case 1 : no child.
            if(root.left == null && root.right == null) {
                return null;
            }

            //case 2 : only one child.
            if(root.left == null) {
                return root.right;
            }
            else if(root.right == null) {
                return root.left;
            }

            //case 3 : Inorder Successer
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
             
        }
        return root;
    }

    //
    public static Node inorderSuccessor(Node root) {
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    //Print In Range of the Tree. frm x to y
    public static void printInRange(Node root ,int X , int Y) {
        if(root == null) {
            return ;
        }
        if(root.data >= X && root.data <= Y) {
            printInRange(root.left, X, Y);
            System.out.print(root.data + " ");
            printInRange(root.right, X, Y);
        }
        else if(root.data >= Y) {
            printInRange(root.left, X, Y);
        }
        else {
            printInRange(root.right, X, Y);
    }
}


   public static void printPath(ArrayList<Integer> path ) {
    for(int i=0 ; i<path.size() ; i++) {
        System.out.print(path.get(i) + "->");
    }
    System.out.println();
   }
    // Root to leaf Path
    public static void printRoot2Leaf(Node root , ArrayList<Integer> path) {
       if(root == null) {
        return;
       }
    
        path.add(root.data);
     
        //leaf
        if(root.left== null && root.right == null) {
            printPath(path);
        }
        else { //non leaf
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        }
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        int values[] = { 8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i =0 ;i<values.length;i++){
             root = insert(root,values[i]);
         }

         System.out.println("our binary tree :");
     inorder(root);
     System.out.println();

    // delete(root , 5);
    // inorder(root); 
    // System.out.println("Node from the range 6  to 10 :" );
    // printInRange(root, 6, 10);
    
    printRoot2Leaf(root, new ArrayList<>());
    }
    
}
