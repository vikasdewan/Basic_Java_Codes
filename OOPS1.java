// class Pen { 

//     String color;
//     String type ; // ball pen , gel pen

//     public void write()  { 
//         System.out.println("writing something");
//     }

//     public void printColor() { 
//         System.out.println(this.color); //this is a keyword here in java
//     }
//     public void printtype() { 
//         System.out.println(this.type);
//     }

//}


  class Student { 

    String name;
    int age ;
    int rollNo ;

    public void printInfo() { 
        System.out.println("Name : " + this.name);
        System.out.println("age : " + this.age);
        System.out.println("rollNO. : " + this.rollNo);
    }


    // ** POLYMORPHISM ** : JAB EK HI KAM KO ALAG ALAG TARIK KE SE KARTE HAI
   
    // TYPE : 1. COMPILE TIME POLYMORPHISM
   
    //        2. RUN TIME POLYMORHISM
   
   
    // COMPILE TIME POLYMORPHISM
     // EX.     public void printInfo(String name) { 
    //     Systm.out.println(name);
    //  }

    //  public void printInfo(int age) { 
    //     System.out.println(age);
    //  }

    //  public void printInfo(String name ,int age) { 
    //     System.out.println(name + " " +  age);
    //  }


     //and now you can call in main fuction for student s1 as : s1.printInfo(s1.name,s1.age); 
     
     // which runs the third funtion of printInfo  
     
     //one thing to notice that non of the above printInfo fuction is same as one give String return other int and another both
     
     //so we can make many functions of same name but there return or type should be different.
    

     // if the have same return type there no. of arguments should be different.
  
  
  
    //below code are for CONstructors , its theory is in main function
  
     //FOR NON-PARAMETRIZE CONSTRUCTORS
//   Student() { 
//     System.out.println("non-parametrize constructor");
//   }

  //FOR PARAMETIRIZE CONSTRUCTORS
//   Student(String name, int age , int rollNo){ 
//     this.name = name;
//     this.age = age;
//     this.rollNo = rollNo;
//   }


  //FOR COPY CONSTRUCTORS
  //Student(Student s2) { 

//     this.name = s2.name;
//     this.age  = s2.age;
//     this.rollNo = s2.rollNo;
// }

// here we have to define one more empty funtion for s1
  // Student () { 

//   }

  }
public class OOPS1 {
    
    public static void main(String[] args) {
        
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "gel";

        // Pen pen2 = new Pen();
        // pen2.color = "black";
        // pen2.type = "ballpoint";

        // //calling

        // pen1.printColor();
        // pen2.printColor();

        // pen1.printtype();
        // pen2.printtype();

        Student s1 = new Student();// Student() --> called "CONSTRUCTORS".

        //*** CONSTRUCTORS *** (TO CONSTRUCT OBJECTS OF JAVA)
       
        //PROPERTY : * EK CLASS KA JO CONSTRUCTOR HAI USKA NAAM  WAHI HOGA JO CLASS KA HOGA.
        //           * CONSTRUCTORS KUCH RETURN NAHI KARTE HAI. WO METHODS HI HOTE HAI FUCTION HI HOTE HAI PAR UNKE AAGE INT VOID FLOAT KARKE KUCH LIKHA NAHI HOTA HAI  
        //           * CONSTRUCTORS KO EK HI BAR CALL KIYA JAA SAKTA HAI.   
       
        // type of constructors.
       
        // 1.NON-PARAMATARIX CONSTRUCTORS
       
        // 2.PARAMETRIZE CONSTRUCTOR
            // ex.    Student s2 = new Student("vikas",19,01);
       
        // 3.COPY CONSTRUCTORS 
       //  ex.   Student s2 = new Student(s1);
       //         s2.printInfo();
       

       //THERE'S NO NEED TO WRITE THE DESTRUCTORS AS JAVA HAVE GARBAGE COLLECTORS WHICH COLLECT THE OBJECT WHICH IS NOT IN USE
        
       


       s1.name = "vikas";
        s1.age = 19;
        s1.rollNo = 1;

        System.out.println("information of student s1 : ");
        s1.printInfo();

            }
}
  
