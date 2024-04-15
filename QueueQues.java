import java.util.*;
public class QueueQues {

    // QUeue using 2 Stacks.

    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
    
    public static boolean isEmpty() {
        return s1.isEmpty();
    }

    public static void add(int data) {
        //1st step to empty the first stack and put all the present data in stack 2 by popping from first stack
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        //2nd step to put the data in first stack
        s1.push(data);
        // 3rd step to fill the first stack by pushing elements from poping from stack 2 and pusing in stack 1.
        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    //remove : dequeue
    public static int remove() {
        if(isEmpty()) {
            System.out.println("EMPTY QUEUE");
            return -1;
        }

          return s1.pop();

    }

    //peek
    public static int peek() {
        if(isEmpty()) {
            System.out.println("EMPTY QUEUE");
            return -1;
        }

          return s1.peek();

    }
    }
 
        public static void main(String args[] ) {
            Queue q = new Queue();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            
            while(!q.isEmpty()) {
                System.out.println(q.peek());
                q.remove();

            }
             
        }



    
}
