import java.util.*;
public class IMP_ARRAY2D {
    public static void main(String[] args) {
      
    //     System.out.println("enter the row and column no. of the matrix resp.:");
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int m=sc.nextInt();
    //  System.out.println("enter the elements of the matrix: ");
    // int matrix[][]=new int[n][m];
    // for(int i=0;i<n;i++){ 
    //     for(int j=0;j<m;j++){ 
    //         matrix[i][j]=sc.nextInt();
    //     }
    // }

    // System.out.println("THE SPIRAL ORDER MARTIX IS: ");

    // int rowStart=0;

    // int rowEnd=n-1;

    // int colStart=0;

    // int colEnd=m-1;

    // //to print spiral order matrix

    // while(rowStart<=rowEnd && colStart<=colEnd){ 
    //     //1
    //     for(int col=colStart;col<=colEnd;col++){ 
    //         System.out.print(matrix[rowStart][col] + " ");
    //     }

    //     rowStart++;

    //     //2

    //     for(int row=rowStart;row<=rowEnd;row++){ 
    //         System.out.print(matrix[row][colEnd] + " ");
    //     }

    //     colEnd--;


    //     //3

    //     for(int col=colEnd;col>=colStart;col--){ 
    //         System.out.print(matrix[rowEnd][col] +" ");
    //     }

    //     rowEnd--;

    //     //4

    //     for(int row=rowEnd;row>=rowStart;row--){ 
    //         System.out.print(matrix[row][colStart] + " ");
    //     }

    //     colStart++;

    //     System.out.println();
    // }


    //2ND QUESTION: FOR A GIVEN MATRIX OF N*M ,PRINT ITS TRANSPOSE.\

    System.out.println("enter the row and column no. of the matrix resp.:");
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int m=sc.nextInt();
      System.out.println("enter the elements of the matrix: ");
     int matrix[][]=new int[n][m];
     for(int i=0;i<n;i++){ 
         for(int j=0;j<m;j++){ 
             matrix[i][j]=sc.nextInt();
         }
     }
      System.out.println("transpose of the given matrix is: ");
     //loop to print transpose of the martix
      for(int j=0;j<m;j++){ 
        for(int i=0;i<n;i++) {
            System.out.print(matrix[i][j]+" ");
        }System.out.println();
      }

    }
    
}
