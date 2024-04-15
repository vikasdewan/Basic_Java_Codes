import java.util.*;
public class funtions1 {
   
//    public static void printMyName(String name){ //called function
//     System.out.println(name);
//     return;   // function return no value
//    }
//     public static void main(String[] args) {   //calling function
//         Scanner sc=new Scanner(System.in);
//         String name=sc.nextLine();  //taking input from user
//         printMyName(name);//call kiya function ko       
 

//     }

    //  public static int returnSum(int a, int b ) {
    //     int sum=a+b;
    //     return sum; 

    //  }
     
    //  public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int a=sc.nextInt();
    //     int b=sc.nextInt();
    //     int sum=returnSum(a,b);
    //     System.out.println(sum);
    //  }

    // public static int returnMultiple(int a,int b){ 
    //     int mul=a*b;  //to directly pass the value of multiplication you can also do as return a*b; 
    //     return mul;

    // }

    // public static void main(String[] args) {
        
    //     Scanner sc=new Scanner(System.in);
    //     int a= sc.nextInt();
    //     int b= sc.nextInt();
    //     int Mul=returnMultiple(a,b); //to directly print the mul. value you can do as sout.("multiplication of 2 vlaues are"+ returnMultiple(a,b));
    //     System.out.println("MUltiplication of "+a+" and "+b+" is "+Mul); 
    // }


    //to find the factorial of the number
    public static int fact(int a){ 
        if(a<0){ 
            System.out.println("Invalid number");
            return 0;
        }
        int temp=1;

        for(int i=1;i<=a;i++){ 
                 temp=temp*i;
        }// if the called function is of void type then print the value here only and the return from here; 
        return temp;
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int f=fact(a);
        System.out.println("FACTORIAL OF THE GIVEN NUMBER IS "+f);


    }
} 
