import java.util.ArrayList;
import java.util.Collections;
//import java.util.*; we can use this import all the packages which are available
//but this will increase our memory size so avoid it.


class ArrayLIsts {


    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        //for String : ArrayList<String> list2 = new ArrayList<>();
        //for Boolean : ArrayList<Boolean> list3 = new ArrrayList<>();
        //in LHS under greater than less than sign can write type of arraylist both syntex are correct.
    
        //to get element

        list.add(1); //.add is a keyword
        list.add(2);
        list.add(3);

        System.out.println( list + "\n");


        // to get element

        int element = list.get(0); // here 0 is index no. of the element 
        System.out.println(element + "\n");
    
        //to add element in between
        list.add(0,0);//adding 0 in 0th index no.
        System.out.println("add: " + list + "\n");

        //to set element
        list.set(0,4); //setting 4 in 3rd index
        System.out.println("set: " + list + "\n");

        //to remove any element
        list.remove(3);
        System.out.println("remove: " + list + "\n");

        //size
        int size = list.size();
        System.out.println(size);

        //loops
        for(int i=0 ; i<list.size() ; i++) { 

            System.out.print(list.get(i) + " ");
        }
        System.out.println();


        //sorting
        Collections.sort(list);  // inside COllections class a fuction "sort"  exist which 
                                 // helps in sorting arraylist not array remember. 
        System.out.println(list + "\n");
    
    }
    
}
