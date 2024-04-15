import java.util.*;
public class QueueJCFW {
    

    
    public static void main(String[] args) {
        //Queue q = new Queue();
    //   Queue<Integer> q = new LinkedList<>();
    Queue<Integer> q = new  ArrayDeque<>();
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
            System.out.println(q .peek());
            q.remove();
        }
        
    }

}
