import java.util.*;
//FIFO : first in first out.
//OPERATION :
//  ENQUE : Add.
// 2. DEQUEUE : Remove.
// 3. FRONT  : Peek.
public class QUEUE {

    //QUEUE using array. 
    // static class Queue {
    //     static int data;
    //     static int arr[];
    //     static int size;
    //     static int rear = -1;

    //     Queue(int n) {
    //         arr = new int[n];
    //         this.size = n;
    //     }

    //     public static boolean isEmpty() {
    //         return rear == -1;
    //     }


    //     //Enqueue  : Add , time complexctiy : O(n).
    //     public static void add(int data) {
    //         if(rear == size-1) {
    //             System.out.println("full queue");
    //             return;
    //         }

    //         rear++;
    //         arr[rear] = data;
    //     }

    //         //deQueue : remove .  // time complexcity : O(n).
    //     public static int remove() {
    //         if(isEmpty()) {
    //             System.out.println("empty queue");
    //             return -1;
    //         }

    //         int front = arr[0];
    //         for(int i =0 ;i<rear; i++) {
    //             arr[i] = arr[i+1];
    //         }
    //         rear--;//as queue decrearse by one due to removal of one element of array.
    //         return front;

    //     }

    //     // peek . time complexcity : O(n).
    //     public static int peek() {
    //         if(isEmpty()) {
    //             System.out.println("Empty queue");
    //             return -1;
    //         }


    //          return arr[0];
    //     }

    // }

    //for Circular Queue using Array :  time complexcity for add, remove,peek is same i.e. O(1).


    static class Queue {
        static int data;
        static int arr[];
        static int size;
        static int rear = -1;
        static int front =-1;
        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear+1) % size == front;
        }

        //Enqueue  : Add , time complexctiy : O(n).
        public static void add(int data) {
            if(isFull()) {
                System.out.println("full queue");
                return;
            }
            //adding first element
            if(  front == -1) {
                front =0;
            }

            rear = (rear+1) % size; // for moving rear in circular path
            arr[rear] = data;
        }

            //deQueue : remove .  // time complexcity : O(1).
        public static int remove() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            int result = arr[front];
            //single element condition
            if(rear == front ) {
                rear = front = -1;
            }
            else{
                front = (front +1) % size; //this special +1 helps most when front lies at the last index of the queue.
            }
            return result;

        }

        // peek . time complexcity : O(n).
        public static int peek() {
            if(isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }


             return arr[front];
        }

    }   
   
    public static void main(String[] args) {
        Queue q = new Queue(5);
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
