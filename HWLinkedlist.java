import java.util.*;

public class HWLinkedlist {
 

    //1. make a linked list  and add the following elements to it : (1,5,7,3,8,2,3). Search for the number 7 and deisplay its index.
    public static void main(String[] args) {
        
        LinkedList<Integer> list =  new LinkedList<>();

        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(8);
        list.addFirst(3);
        list.addFirst(7);
        list.addFirst(5);
        list.addFirst(1);
        System.out.println(list);

        int value = 7;
        int i;
        for( i =0 ; i<list.size() ; i++) { 
             if(list.get(i) == value) { 
                break;
             }
             else { 
                continue;
             }
        }
        System.out.println("index no. of 7 is : " + i);

    }

    
}
