import java.util.*;
public class StackDataStru {
    

    //Implimentation of Stack in the form of linked list 
    // static  class Node {
    //     int data;
    //     Node next;
    //     public Node(int data) {
    //         this.data = data;
    //         next = null;
    //     }
    // }
    
    // static class Stack { 

    //     public static  Node head;
    //     public static boolean isEmpty() {
    //         return head == null;
    //     } 
    //     public static void push(int data ) {
    //         Node newNode = new Node(data);
    //         if(isEmpty()) {
    //             head = newNode;
    //             return;
    //         } 

    //         newNode.next = head;
    //         head = newNode;

    //         }
            
    //        public static int pop() { //use to delete the head of our stack
    //         if(isEmpty()) {
    //             return -1;//-1 show that our stack is empty
    //         }
    //         int top = head.data;
    //         head = head.next;
    //         return top; //return the deleted head

    //        }
           
    //        public static int peek() {
    //         if(isEmpty()) {
    //             return -1;

    //         }
    //         return head.data; //returns the data of the head;
    //        }
    //     }

    

        //Implementation of Stack through Array List.

        // static class Stack {
        //     static ArrayList<Integer> list = new ArrayList<>();
        //     public static boolean isEmpty() {
        //         return list.size() == 0;
        //     }

        //     //push
        //     public static void push(int data) {
        //         list.add(data);
        //     }

        //     //pop
        //     public static int pop() {

        //         if(isEmpty()) {
        //          return -1;
        //         }
        //         int top  = list.get(list.size() -1);
        //         list.remove(list.size() - 1);
        //         return top;
        //     }

        //     //peek
        //     public static int peek() {
        //         if(isEmpty()) {
        //             return -1;
        //         }
        //         return list.get(list.size() - 1); // pop me jo top ka RHS hai usse return karna hai Peek me.
        //     }
            
        // }


        //Through Java Collection FrameWork
    public static void main(String[] args) {
         
        //Stack s = new Stack(); used for Arraylist and Linked List
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        //System.out.println("stack Implementation through Linked List :");
        //System.out.println("stack Implementation through Array List :");
        System.out.println("Stack implementation by using Collection FrameWOrk :");
        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
