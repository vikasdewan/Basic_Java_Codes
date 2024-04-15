//ABSTRACTION


abstract  class Animal { 

    abstract void walk();
    public void eat() { 
        System.out.println("Animal eats");
    }
        Animal() { //creating constructors 
            System.out.println("YOU created a new animal");
        }
    
  }

  class Horse extends Animal { 

      Horse() {  //constructor
        System.out.println("name of the animal is Horse");
      }
    public void walk() {
        System.out.println("Horse walks on 4 legs");
    }

  }

  class Penguin extends Animal {

    public void walk() { 
        System.out.println("Penguin walks on 2 legs");
    }
  }


public class OOPs3 {
    
    public static void main(String[] args) {

        Horse horse = new Horse();
        // horse.walk();
        // horse.eat();
        // Animal animal = new Animal();// runtime error 
        // animal.walk();
    }

}
