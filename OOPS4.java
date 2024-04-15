//INTERFACES (pure abstraction)

interface Animal {
     void walk(); //default access modifier
    //constructors cannot be made in interface
}

interface Herbivore { 

}

class Horse implements Animal ,Herbivore { //  MULTIPLE INHERITANCE

    //IN JAVA MULTIPLE INHERITANCE CLASSES SE NAHI HOTA HAI INTERFACES SE HOTA HAI
    public void walk() {           //public access modifier
        System.out.println("walks on 4 legs");
    }
}




public class OOPS4 {
    
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    
    }
}
