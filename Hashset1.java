import java.util.HashSet;
import java.util.Iterator;
public class Hashset1 {


    public static void main(String args[]) {
        //Creating
        HashSet<Integer> set = new HashSet<>();
        
        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); // only unique elementt is store in hash so this not store

        //Size
        System.out.println("size of my set is  : " +  set.size());

        //To print all the element in our size
        System.out.println(set);//simply write the name of the size.

        //search - contains
        // if(set.contains(1)) {
        //     System.out.println("set contains one");
        // }
        // if(!set.contains(6)) {
        //     System.out.println("does not contains 6");
        // }


        // // Delete
        // set.remove(1);
        // if(!set.contains(1)) {
        //     System.out.println("does not contain  1 - we deleted 1");
        // }


        // ****Iterator ****
        Iterator it = set.iterator(); 
            //hasNext , next ;
            System.out.println("elements in sets are :");
            while(it.hasNext()) {
                System.out.println(it.next()); 
            }

    }

}
