import java.util.*;
public class HashMap1 {
    
    public static void main(String[] args) {
        
        HashMap<String ,Integer> map = new HashMap<>();

        //Insertion
        map.put("China",150);
        map.put("India",130);
        map.put("USA",50);

        System.out.println(map);
        //changes
        map.put("China",180);
        System.out.println(map);
        
        //Searching
        if(map.containsKey("China")) {
            System.out.println("YES KEY EXIST IN MAP");
        }
        else {
            System.out.println("NO KEY DOESNOT EXIST IN THE MAP");
        }

        if(map.containsKey("Pakistan")) {
            System.out.println("YES KEY EXIST IN MAP");
        }
        else {
            System.out.println("NO KEY DOESNOT EXIST IN THE MAP");
        }

        //TO get the value assigned to the key

        System.out.println("population of the china is : " +map.get("China"));
        
        //what happend if the key doesnot exist in map

        System.out.println("population of the pakistan is : " + map.get("Pakistan"));
    
        // Iteration
        //two methods to use "for" loop. understand by below example
        int arr[] = {1,2,3};
        
        //1st
        for(int i =0 ;i<3;i++) {
            System.out.print(arr[i] + " ");
        }System.out.println();
        
        //2nd
        for(int val : arr){
            System.out.print(val + " ");
        }System.out.println(); 


        //below method is to get both key and value

        //Now for HaspMap
    
        //for(Map.Entry<key type,value type> e :  map.entrySet())
    
        //here map.entrySet() -> map is the name of Haspmap 

        for(Map.Entry<String , Integer> e : map.entrySet()) {
            System.out.print(e.getKey() + " ");
            System.out.println(e.getValue());
        }
        System.out.println();

        //method to get values through keys.   
        Set<String> keys = map.keySet();
        for(String key : keys) {
            System.out.println(key + " " + map.get(key));
        }
        System.out.println();

        //rempval of the key and value from the map.

        map.remove("China");
        System.out.println(map);


    
        }
    }

