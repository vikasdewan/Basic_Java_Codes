import java.util.*;
public class array1 {
  
   public static void main(String[] args) {
     
    // array for the students marks 
    // int marks[]=new int[5];
    // marks[0]=94;//english 
    // marks[1]=91;//hindi
    // marks[2]=95;//maths
    // marks[3]=95;//physics
    // marks[4]=97;//chemistry
    //we can also initialize the array like
//     int marks[]={94,91,95,95,97};


//     for(int i=0;i<5;i++){ 
//     System.out.println("marks of "+(1+i)+" subject is "+marks[i]);
//    } 

    //now taking size of the array and input from the user
    //  Scanner sc=new Scanner(System.in);
    //  System.out.print("enter the size of the array: ");
    // int size=sc.nextInt();
    // int number[]=new int[size];
    // for(int i=0;i<size;i++){ 
    //     number[i]=sc.nextInt();//to take the input form the user
    // }
    // for(int i=0;i<size;i++) {
    // System.out.println("number "+(1+i)+" is "+ number[i]);//here we donot tell the values of the array then system shows null value i.e. 0 for interger 0.0 for float ,false for boolen,and for string it store empty string " "
    // }
   
    //question take an array as input from the user.
    //search for a given number x and print the index at which it occurs.

    Scanner sc=new Scanner(System.in);
    System.out.print("enter the size of the array : ");
    int size=sc.nextInt();
    int num[]=new int[size];
    System.out.println("enter the array elements");
    for(int i=0;i<size;i++){
        num[i]=sc.nextInt();
    }
    System.out.println("enter the number to be search in the array");
    int x=sc.nextInt();
    for(int i=0;i<num.length;i++){//here num.length=size of num array;so you can use it when you don't want to add new variavble for the size 
        if(x==num[i]){ 
            System.out.println("index number at which it occurs is : "+i+" as elements of array are");
              break;  
        }
    
        
    }
    for(int i=0;i<size;i++) {
        System.out.print(num[i]+" ");
    }

}
}