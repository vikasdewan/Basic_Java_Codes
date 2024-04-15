import java.util.*;
public class binaryTreeHWques {

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

static int sumOfNodesAtKthLevel(Node root, int k) {

    if(root == null) {
        return 0;
    }
    Queue<Node> q = new LinkedList<>();

    q.add(root);
    //level is used to track the current level.
    int level =0;
    int sum =0;
    //flag is used to break out of the loop after the sum 
    // of all the nodes at Kth level is found
    int flag =0;
    
    while(!q.isEmpty()) {
        int size = q.size();
        while(size-->0) {
            Node ptr = q.peek();
            q.remove();
            if(level == k) {
                flag = 1;
                sum = sum + ptr.data;
            }
            else {
                if(ptr.left != null){
                    q.add(ptr.left);
                }
                if(ptr.right != null) {
                    q.add(ptr.right);
                }

            }
        }

        level ++;

            if(flag == 1)
            break;

    }
    return sum;
}
    
   public static void main(String[] args) {
    int nodes[] = { 1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    //level in our Tree start from  0 i.e. first level named as 0.
    int level =1;
    BinaryTree tree = new BinaryTree();
    Node root = tree.buildTree(nodes);
    int result = sumOfNodesAtKthLevel(root , level);    

    System.out.println(result);
   }
}
