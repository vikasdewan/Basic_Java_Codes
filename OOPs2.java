//THEORY OF INHERITANCE

//it is the method by which one  class  inherit the property of another class
// there are 4 types of inheritance :
// 1.Single Level inheritance
// 2.Multi level inheritance 
// 3.Hierarchial Inheritance
// 4.Hybrid inheritance : isme kahi pa single level inheritance chalta hai toh kahi
// par multi level inheritance ya phir heirarchieal inheritance
 


import java.util.*;
import bank.*; // bank package. 

class Shape {    // base case

    public static void area()  { 
        System.out.println("display area");
    }
 }

class Triangle extends Shape {    //single level inheritance  : ek base case aur ek derived case
      public static void area(int l, int h) { 
       System.out.println(1/2 * l * h);        
      }
 }

 class EquilateralTriangle extends Triangle {  //multi level inheritance : ek main base case hota hai aur jo derivered case hai wo base case ki tarah act karta hai dusare derived case ke liye
    public static void area(int l, int h) {
        System.out.println(1/2 * l * h); 
    }
 }

 class Circle extends Shape {   //herirachy inheritance : ek base case aur usi ke multiple derived case 
    public static void are(int r) { 
        System.out.println(2 * 3.14 * r);
    }
 }


public class OOPs2 {
    
    public static void main ( String args[]) { 

        // Triangle t1 = new Triangle();
        // t1.color = "red"; //here t1.color gives no error because Triangle class indherit the property shape clas
        //this helps coders to do less coding in the workplace


      //bank.Account account1 = new bank.Account(); 
    }








    
}
