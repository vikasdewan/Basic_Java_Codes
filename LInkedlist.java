 import java.util.*;
 class LL {

    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addFirst("this");
        list.add("list");// by default for addLast you can use add only
        System.out.println(list);

        System.out.println(list.size());

        for(int i =0 ; i<list.size() ; i++ ) { 

            System.out.print(list.get(i)+ " -> ");
        }
        System.out.println("null");
    
    //delete
        list.removeFirst();
        System.out.println(list);
        
        list.removeLast();
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    
    
    }

    

}
