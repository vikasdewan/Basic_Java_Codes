import java.util.*;
class reverseLinkedList {

    Node head;
    private int size;
    
    reverseLinkedList() { 
        this.size = 0;
    }
    class Node { 
        int  data;
        Node next;


        Node(int data2) { 
            this.data = data2;
            this.next = null;
            size++;
        }
    }

    //add - first,last
    //add - first 
    public void addFirst(int data) { 
        Node newNode = new Node(data);
        if(head == null) { 
            head = newNode ;
            return;
        }
         
            newNode.next = head;
            head = newNode ;
        

        
    }
     

    //add - last
    public void addLast(int data) { 

        Node newNode = new Node(data);
    
        if(head == null) { 
            head = newNode ;
            return;
        }

        Node currNode = head;
        while(currNode.next != null) { 
            currNode = currNode.next;
        }

        currNode.next = newNode;
        }

        //print 
        public void printList() { 
            if(head == null) { 
                System.out.println("list is empty");
                return;
            }
            Node currNode = head;
        while(currNode != null) { 
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
        }



        //delete first
        public void deleteFirst() {
            if(head == null) {
                System.out.println("list is empty");
                return ;
               }
               head = head.next;
               size--;
            }

        //delete last
        public void deleteLast() { 
            if(head == null ) { 
                System.out.println("List is empty");
                return;
            }
            size--;
            if(head.next == null) { 
                head = null;
                return;
            }

            Node secondLast = head;
            Node lastNode = head.next;
            while(lastNode.next != null) {
                lastNode = lastNode.next;
                secondLast = secondLast.next;
            }
            secondLast.next = null;
        }

        public int getSize() {
            return size; 

        }

        public void reverseIterate() {

            if(head == null || head.next == null) { 
                return;
            }

            Node prevNode = head;
            Node currNode = head.next;
            while(currNode != null) { 
                Node nextNode = currNode.next;
                currNode.next = prevNode;

                //update
                prevNode = currNode;
                currNode = nextNode;
            }
            head.next = null;
            head = prevNode;

        }
        
        //recursive method of reverse linkedlist

        public Node reverseRecursive(Node head) { 
            
            if(head == null || head.next == null) { 
                return head;
            }
            Node newHead = reverseRecursive(head.next);
            head.next.next = head;
            head.next = null;

            return newHead;
        }




    public static void main(String args[] ) { 
        
      reverseLinkedList   List = new reverseLinkedList();
      List.addLast(1);
      List.addLast(2);
      List.addLast(3);
      List.addLast(4);
      List.addLast(5);
      List.printList();

   //   List.reverseIterate(); //iterative method for reverse
     List.head =  List.reverseRecursive(List.head);
   List.printList();



    }
}
