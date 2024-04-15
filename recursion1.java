import java.util.*;
public class recursion1 {


    //print numbers from 5 to 1;
    //this question can be done by iteration i.e. 
    //loops or by using recursive funtions
//     public static void printNumb(int n) { 

//     if(n==0) { 
//         return;
//     }
//     System.out.print(n+" ");
//     printNumb(n-1); 
// } 

//     public static void main(String[] args) {

//       // through iteration process
//         //  for(int i=5;i>0;i--){ 
//         //    System.out.println(i+" ");
//         //}
//         int n=5;

//         printNumb(n);
//     }

     //print numbers from 1 to 5 ;
    //this question can be done by iteration i.e. 
    //loops or by using recursive funtions
    // public static void printNumb(int n) { 

    //     if(n==6) { 
    //         return;
    //     }
    //     System.out.print(n+" ");
    //     printNumb(n+1); 
    // } 
    
    //     public static void main(String[] args) {
    
    //       // through iteration process
    //         //  for(int i=5;i>0;i--){ 
    //         //    System.out.println(i+" ");
    //         //}
    //         int n=1;
    
    //         printNumb(n);
    //     }
   


    // print sum of first n natural numbers;

    
    // public static void printSum(int n,int sum) { 
    //     if(n==0) { 
            
    //         System.out.println("sum of first all numbers upto given numbers are : "+sum);
    //         return;
    //     }
        
    //     sum=sum+ n;
    //     printSum(n-1,sum);


    // }
    // public static void main(String[] args) {
        
    //     Scanner sc=new Scanner(System.in);
    //     System.out.print("enter the value for n: ");
    //     int n=sc.nextInt();
    //     printSum(n,0);
    // }


    // PRINT FACTORIAL OF A NUMBER N;
    // public static int  printFact(int n){ 
    //     if(n==1 || n==0){ 
    //         return 1;
    //     }
    //     int fact_nm1 = printFact(n-1);
    //     int fact_n= n * fact_nm1;//fact_nm1=factorial n-1
    //     return fact_n;
    // }

    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.print("enter the number for which to find factorial: ");
    //     int n=sc.nextInt();
   
    //    int factorial =printFact(n);
    //     System.out.println("factorial of the given number is :"+factorial);
    // }


    //print the fibonacci sequence till nth term;
    

    // public static void printFibo(int a,int b,int n){ 
        
    //     if(n==0){ 
    //         return;//required no. of terms over
    //     }
        
    //     int c=a + b ;

    //     System.out.print(c+" ");
    //     printFibo(b,c,n-1);
    // }

    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int a=0;
    //     int b=1;
    //     System.out.print("enter the nth term: ");
    //     int n= sc.nextInt();
    //     System.out.print(a + " "+ b + " " );
    //     printFibo(a,b,n-2);//as we print two digits already.
    // }

        //print the x^n (n = stack height)//eg stack height and n == 4 and 3 then it is equal as diff is negligible

    // public static int calcPower(int x,int n){ 
      
        
    //     if(n==0) {      //base case 1
    //         return 1;
    //     }
    //     if(x==0) {      //base case 2
    //         return 0;
    //     }
    //    int  xPownm1 = calcPower(x,n-1);//kaam
     
    //    int xPown=x * xPownm1;//kaam
    
    //    return xPown;//return value
    // }

    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.print("enter the value of x and n respectively : ");
    //     int x=sc.nextInt();
    //     int n=sc.nextInt();
    //     int ans= calcPower(x,n);
    //     System.out.println("desired answer is:  " + ans);
    // }

            //print x^n where (stack height = logn)// 
 
            
             public static int calcPower(int x,int n){ 
      
        
         if(n==0) {      //base case 1
             return 1;
         }
         if(x==0) {      //base case 2
             return 0;
         }
        //if n is even
        if(n % 2 == 0) { 
            return calcPower(x,n/2) * calcPower(x,n/2);
        }
        //n is odd
        else {  

            return  calcPower(x,n/2) * calcPower(x,n/2) * x;
        }

     }

     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.print("enter the value of x and n respectively : ");
         int x=sc.nextInt();
         int n=sc.nextInt();
         int ans= calcPower(x,n);
         System.out.println("desired answer is:  " + ans);
     }

}