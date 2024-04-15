import java.util.*;
public class binaryTreeDS {
    
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }


    }

     static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left  = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;

        }
     }


     //preOrder Traversal  : 1> root , 2> leftsubtree, 3> rightsubtree.
     public static void preorder(Node root) {
        if(root == null) {
            return;
        }
        
        System.out.print(root.data  + " ");
        preorder(root.left);
        preorder(root.right);

     }

     //Inorder traversal : 1> leftsubtree , 2> root , 3> rightsubtree.
     //Timecomplexcity : O(n).
     public static void inorder(Node root) {
        if(root == null) {
            return; // here you can print -1 and then return 
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
     }

     //postorder traversal : 1> leftsubtree , 2> rightsubtree, 3> root
     //Timecomplexcity : O(n).
     public static void postorder(Node root) {
        if(root == null) {
            return;
        }
        
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
     }

     //LeverOrder Traversal : level wise printing : timecomplexcity : O(n).
     public static void levelOrder(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);


        while(!q.isEmpty()) {
            Node currNode = q.remove();
            if(currNode == null)  {
                System.out.println();
                if(q.isEmpty()) {
                    break;
                }
                else {
                    q.add(null);
                }
            }
            else {
                System.out.print(currNode.data + " ");
                if(currNode.left != null) {
                    q.add(currNode.left);
                }
                if(currNode.right != null) {
                    q.add(currNode.right);
                }
            } 
            
        }

     }

     //QUESTION 1 : COUNT OF NODES. , timecomplexcity : O(n).
     public static int countOfNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int  leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes + rightNodes + 1;
     }

     //QUESTION 2 : SUM OF NODES. , timecomplexcity : O(n).
     public static int sumOfNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int  leftsum = sumOfNodes(root.left);
        int rightsum = sumOfNodes(root.right);
 
        return leftsum + rightsum + root.data;
     }

      //QUESTION 2 : SUM OF NODES. , timecomplexcity : O(n).
      public static int heightOfTree(Node root) {
        if(root == null) {
            return 0;
        }
        int  leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        int myHeight = Math.max(leftHeight, rightHeight) +1;
         return myHeight;
         // this you can also use instead of myHeight.
        // int result_1 = leftHeight + 1;
        // int result_2 = rightHeight +1 ;
        // if(leftHeight > rightHeight) {
        //     return result_1;
        // }
        // else {
        //     return  result_2;
        // }
     }

     //Approach 1 of :
      //Question 4 : diameter of the tree : longest path between any two nodes.
      //time complexcity : O(N^2) as we traverse the tree 2 time 1st in diam1 and diam2 and 2nd for diam3
     public static int diameter(Node root) {
       if(root == null) {
        return 0;
       }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = heightOfTree(root.left) + heightOfTree(root.right) +1;

        return Math.max(diam3 , Math.max(diam1,diam2));
    }


    //Approach 2 of :
    static class TreeInfo {
        int ht;
        int diam;

        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter2(Node root) { 

        if(root == null) {
           return new TreeInfo(0,0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht ,right.ht) +1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht +1;

        int mydiam = Math.max(Math.max(diam1,diam2),diam3);

    TreeInfo myInfo = new TreeInfo(myHeight,mydiam);
    return myInfo;        


    }


    public static void main(String[] args) {
        int nodes[] = { 1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root =  tree.buildTree(nodes);
        //System.out.println(root.data); //here 1 comes out as output i.e. our tree made successfully because root is 1 of our tree.
       // preorder(root);
       // inorder(root);
       // postorder(root);
      // levelOrder(root);

      //Question 1 : count of nodes
      //System.out.println("No. of nodes present : " + countOfNodes(root));
    //Question 2 : sum of nodes
   // System.out.println("sum of all the Nodes present is : " + sumOfNodes(root));
    //Question 3 : height of tree
   // System.out.println(" Height of tree is : " + heightOfTree(root));
    

     //Question 4 : diameter of the tree : longest path between any two nodes.
   //Approach 1
     // System.out.println("Diameter of the tree is : " +  diameter(root));
   //Approach 2
    System.out.println("Diameter of the tree is : " + diameter2(root).diam); 
    }

}
