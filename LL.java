import java.util.*;
class LL {

    Node head;
    private int size;
    
    LL() { 
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
 





    public static void main(String args[] ) { 
        
      LL  list = new LL();
      list.addLast(1);
      list.addLast(2);
      list.addLast(3);
      list.addLast(4);
      list.addLast(5);
      list.printList();

      list.reverseIterate();
      list.printList();



        
        // list.addFirst("a");
        // list.addFirst("is");
        // list.printList();

        // list.addLast("list");
        // list.printList();

        // list.addFirst("This");
        // list.printList(); 
    
        // list.deleteFirst();
        // list.printList();


        // list.deleteLast();
        // list.printList();

        // System.out.println(list.getSize());//NULL IS NOT COUNTED IN SIZE.
        // list.addFirst("This");
        // list.printList();
        // System.out.println(list.getSize());
    
        
    }

    
}
