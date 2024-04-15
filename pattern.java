import java.util.*;
public class pattern {
  
    public static void main(String[] args) {
        //1ST pattern
        // *****
        // *****
        // *****
        // *****
        // int i;
        // int j;
        // for(i=1;i<=4;i++)
        // { 
        //     for(j=1;j<=5;j++){
        //         System.out.print("*");
        //     }System.out.print("\n");
        // }
        //2ND pattern
        //*****
        //*   *
        //*   * 
        //*****  
      //use below code for the output print or use other
    //   for(int i=1;i<=4;i++){
    //     for (int j=1;j<=5;j++){
    //       if(i==2 ||i==3 ){ 
    //         if(j==2 || j==3 || j==4){ 
    //             System.out.print(" ");
    //         continue;}
    //         else
    //         System.out.print("*");
    //       }
    //       else
    //       System.out.print("*");
    //     }System.out.println();

    //     }
    //use this easy code for the same output pattern

    //  for(int i=1;i<=n;i++) { 
    //     for(int j=1;j<=m;j++){ 
    //         if(i==1 || j==1 || i==n || j==m){
    //         System.out.print("*");
    //         }
    //         else{
    //         System.out.print(" ");
    //         }
    //     }System.out.println();
    //  }
           //3RD pattern  
            //   *
            //   **
            //   ***
            //   ****
            // for(int i=1;i<=4;i++){ //outer loop run from 1 to n=4
            //     for(int j=1;j<=i;j++){ //inner loop rum from j=1 to j=i
            //         System.out.print("*");
            //     }System.out.println();
            // }


            // 4TH pattern
            // ****
            // ***        
            // **    
            // *   
            //  for(int i=4;i>=1;i--){//outer loop run from n=4 to 1 and i--
            //      for(int j=1;j<=i;j++){// inner loop run from 1 to i and j++
            //          System.out.print("*");
            //      }System.out.println();
            //  }
             
            //5TH PATTERN

            //    *
           //    **
          //    ***
          //   **** 
        //   for(int i=1;i<=4;i++){ 
        //      // innr loop for space print
        //       for(int j=4-i;j>=1;j--){
        //           System.out.print(" ");
        //        } 
        //      //  inner loop for star print
        //        for(int j=1;j<=i;j++){ 
        //           System.out.print("*");
        //       }
        //   System.out.println();
        //     }   
           

        //6TH Pattern
        //1
        //1 2
        //1 2 3
        //1 2 3 4
        //1 2 3 4 5
        // for(int i=1;i<=5;i++){ 
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }System.out.println();
        // }
        
        //7TH PATTERN
        //1 2 3 4 5
        //1 2 3 4
        //1 2 3
        //1 2
        //1
        //outer loop goes from 1 to n=5
        //  for(int i=1;i<=5;i++){ 
        //     //inner loop goes from 1 to n-i+1 here n=5
        //     for(int j=1;j<=6-i;j++ ){ 
        //         System.out.print(j+" ");  
        //     }System.out.println();
        //  }

            // 8TH PATTERN (FLOYD'S TRIANGLE)
            //1
            //2 3
            //4 5 6
            //7 8 9 10
            //11 12 13 14 15
            // int k=1;
            // for(int i=1;i<=5;i++){ 
            //     for(int j=1;j<=i;j++){ 
            //         System.out.print(k+" ");
            //         k++;
            //     } System.out.println();
            // }
        
                //9TH PATTERN ( LITTLE HARD) HINT : HERE BY ROW AND COLOMN NO. 
                //YOU CAN SAY THAT WHEN i+j=even then print 1 and 
                //when i+j=odd then printf 0 

             //1
             //0 1
             //1 0 1
             //0 1 0 1
             //1 0 1 0 1
            //  int i;
            //  int j;
            //  for( i=1;i<=5;i++){ 
            //     for(j=1;j<=i;j++){   
            //         if((i+j)%2==0){ 
            //             System.out.print("1 ");
            //         }
            //         else if((i+j)%2!=0){ 
            //             System.out.print("0 ");
            //         }    
            //         }System.out.println();

            //         }
                }
             }


         


    
 
