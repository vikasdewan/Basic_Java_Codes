import java.util.*;
public class top10quesbeginer {
      //     // 1st ques : enter 3 numbers from the user and make a function to print their average
    //     public static void average(float a,float b,float c){ 
    //         float avg;
    //         avg=(a+b+c)/3;
    //         System.out.println("average of 3 numbers is "+avg);
    //     }

    // public static void main(String[] args) {
        
    //     Scanner sc= new Scanner(System.in);
    //     float a=sc.nextFloat();
    //     float b=sc.nextFloat();
    //     float c=sc.nextFloat();
    //     average(a,b,c);

    // }


     //2nd ques : write a funvtion to print the sum of all odd numbers from 1 to n;
    //  public static void sumOfNum(int n){ 
    //     int sum=0;
    //     for(int i=1;i<=n;i++){ 
    //         if(i%2!=0){ 
    //             sum=sum+i;
    //         }
    //         else{ 
    //             continue;
    //         }
    //     }
    //     System.out.println("sum of odd numbers from 1 to "+n+" is "+sum);
    //  }

    //  public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     sumOfNum(n);
    //  }

    //3rd ques :write a function which takes in 2 numbers and returns the greater of those two
    // public static float greater(float a,float b){ 
    //     float temp=0;
    //     if(a>b){
    //         return a;   
    //   }
    //   else { 
    //       return b;
    // }
      
    // } 
      
    //  public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     float a=sc.nextFloat();
    //     float b=sc.nextFloat();
    //     float G=greater(a,b);
    //     System.out.println("greater is "+G);
    //  }
      

    //Write a function that takes in the radius as input and returns the circumference of a circle
    // public static float perimeter(float r){ 
    //     float circum=(22*r*r)/7;
    //     return circum;
    // }

    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     float r=sc.nextFloat(); //here r is a actual parameter
    //     float temp=perimeter(r);
    //     System.out.println("circumference of the circle of the radius "+r+" is "+temp);
    // }

 
        //5th ques: write a function that takes in age as input and returns it that person is eligible to vote or not.
        //a person of age > 18 is eligible to vote

        // public static String age(int a){
             
        //     String temp;
        //     if(a>18) { 
              
        //         temp="Person is eligible";
        //     }
        //     else{ 
        //         temp="Person is not eligible";
        //     }
        //     return temp;
            
        // }

        // public static void main(String[] args) {
        //     Scanner sc=new Scanner(System.in);
        //     int a=sc.nextInt();
        //     String T=age(a);
        //     System.out.println(T+" for voting");
        // }

            //6th ques: write an infinite loop using do while condition

            // public static void main(String[] args) {
            //     Scanner sc=new Scanner(System.in);
            //     int temp;
            //     do{
            //         System.out.println("enter the age of person to check wheater he/she is eligible for voting or not");
            //         int a=sc.nextInt();
            //         if(a>=18){ 
            //             System.out.println("yes! person is eligible for voting");
            //         }
            //         else{ 
            //             System.out.println("No! person is not eligible for voting");
            //         }
            //         System.out.println("Do you want to continue:for (YES) PRESS(1)||for (NO) PRESS(0)");
            //             int T=sc.nextInt();
            //             temp=T;

            //     }while(temp==1);
            // }

            //7th ques:Write a program to enter the numbers till the user wnats and at the end it should display the count of positive,negative and zeros entered

            // public static void main(String[] args) {
            //     Scanner sc=new Scanner(System.in);
            //     int count1=0,count2=0,count3=0;
            //     int temp;
            //     do{
            //         System.out.println("enter the number of your wish");
            //         int n=sc.nextInt();
            //         if(n>0){ 
            //             count1=count1 +1;
            //         }
            //         else if(n<0){ 
            //             count2=count2 + 1;
            //         }
            //         else if(n==0){ 
            //             count3=count3 + 1;
            //         }
            //         System.out.println("DO YOU WANT TO CONTINUE:FOR (YES) PRESS (1)|| FOR (NO) PRESS (0)");
            //         int T=sc.nextInt();
            //         temp=T;
            //     }while(temp==1);
            //     System.out.println("no. of positive ,negative,zeros are "+count1+" "+count2+" "+count3+" respectively.");

            // }
                
            //8th ques: Two numbers are entered by the user,x and n.Write a function to find the value of one 
            //number raised to the power of another i.e. X ki power n.
            // public static void power(int x,int n){ 
            //     int result=1;
            //     while(n>0){ 
            //         result= result*x;
            //         n--;
            //     }
            //     System.out.println("result for the entered value is "+result);
            //     return;
            // }

            // public static void main(String[] args) {
            //     Scanner sc=new Scanner(System.in);
            //     System.out.print("enter the base value: ");
            //     int x=sc.nextInt();
            //     System.out.print("enter the raised to the power value: ");
            //     int n=sc.nextInt();
            //     power(x,n);
            // }

            // 9th  ques:Write a program to print Fibonacci serries of n terms where n is input bu the user:
            //0 1 1 2 3 5 8 13 21
            // public static void main(String[] args) {
            //     Scanner sc=new Scanner(System.in);
            //     System.out.print("enter the number of terms till you want the Fibonacci series: ");
            //     int n=sc.nextInt();
            //     int a=0;
            //     int b=1;
            //     int c=0;
            //     System.out.print("Fibonacci series of "+n+" terms are :"+a+" "+b+" ");
            //     while((n-2)>0){ 
            //         c=a+b;
            //         a=b;
            //         b=c;
            //         n--;
            //         System.out.print(c+" ");
            //     }
            // }

            //10th ques: write a function that calculates the greatest common divisor of the 2 numbers.
            // public static void main(String[] args) {
            //     Scanner sc=new Scanner(System.in);
            //     System.out.print("enter the first number: ");
            //     int num1=sc.nextInt();
            //     System.out.print("enter the second number: ");
            //     int num2=sc.nextInt();
            //     int GCD=0; //GReatest common divisor=GCD
            //     for(int i=1;i<=num1 && i<=num2;i++){ //jo GCD hai wo do no no. se chota ya equal hoga isliye && use kiya hai
            //         if(num1%i==0 && num2%i==0) { //yaha agar do no. 12 aur 6 hota toh common divisor 3 bhi hai par wo print 
            //             GCD=i;                   //nahi hua kyu ki i++ ho gaya aur wo tab tak  ++ hoga jab tak uska condition 
            //                                     //true hoo raha hoga
                        
            //         }
            //         else{ 
            //             continue;
            //         }
            //     }
            //     System.out.println("Greatest common divisor of "+num1+" and "+num2+" is "+GCD);
                  
            // }
    }
    

