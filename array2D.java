import java.util.*;


public class array2D {


 public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    //basic matrix input code and print code
//      System.out.print("enter the rows of the matrix: ");
//      int rows=sc.nextInt();
//      System.out.print("enter the coloum of the matrix: ");
//      int cols=sc.nextInt();
//     int number[][]=new int[rows][cols];//matrix declaration
//     System.out.println("enter the elements of the matrix");
//      //outer loop for the control of row number
//      for(int i=0;i<rows;i++){ 
//         for(int j=0;j<cols;j++){ 
//             number[i][j]=sc.nextInt();
//         }
//      }
//      System.out.println("given matrix is: ");
//         //loop for printing the elements of the matrix
//         for(int i=0;i<rows;i++) {
//             for(int j=0;j<cols;j++){ 
//                 System.out.print(number[i][j]+" ");
//             }System.out.println();
// }  


    //ques: take a matrix as input from the user.Search for a given number x and print the indices at which it occurs.
    System.out.print("enter the rows of the matrix: ");
     int rows=sc.nextInt();
     System.out.print("enter the coloum of the matrix: ");
     int cols=sc.nextInt();
    int number[][]=new int[rows][cols];//matrix declaration
    System.out.println("enter the elements of the matrix");
     //outer loop for the control of row number
     for(int i=0;i<rows;i++){ 
        for(int j=0;j<cols;j++){ 
            number[i][j]=sc.nextInt();
        }
     } 
     System.out.println("enter the number to be search in the given matrix");
     int x=sc.nextInt();
     int Flag=0;
     //loop for Search
     for(int i=0;i<rows;i++) {
        for(int j=0;j<cols;j++){ 
            if(x==number[i][j]){  
                System.out.println("indices are:"+"\n"+" i= "+i+"\n"+"and j= "+j);
                Flag=1;
            }
            }
        }
           if(Flag==0){ 
            System.out.println("number do not exist in the given matrix");
           }
     }
     
    
}

