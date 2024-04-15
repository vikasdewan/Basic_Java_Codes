public class QueueLinkedList {
   static  class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
     }

     static class Queue {
        static Node head = null;
        static Node tail = null;
        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        //Enqueue  : Add , time complexctiy : O(n).
        public static void add(int data) {
            Node newNode = new Node(data);
            if(tail == null) {
                tail = head = newNode;
                return;
            }
            tail.next = newNode;
            tail =  newNode;  
        }

            //deQueue : remove .  // time complexcity : O(1).
        public static int remove() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            
            int front = head.data;
            if(head == tail ) {
                tail = null;
            }
            head = head.next;
            return front;
        }

        // peek . time complexcity : O(n).
        public static int peek() {
            if(isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }


             return head.data;
        }

    }   
   
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove() + "  is remove");
        q.add(6);
        System.out.println(q.remove() + "  is remove" + "\nfinal queue :  ");
        q.add(7);

     
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        
    }

}
