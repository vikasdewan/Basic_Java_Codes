public class practicepattern2 {
   public static void main(String[] args) {
    //pattern hollow butterfly
//     for(int i=1;i<=5;i++)
    
//     { 
//         //1st inner loop for spaces in left portion of the upper part of the pattern
//         for(int j=1;j<=i;j++){ 
//             if(i==3 && j==2 || i==4 && j==2 || i==4 && j==3 || i==5 && j==2 || i==5 && j==3 || i==5 && j==4){ 
//                  System.out.print(" ");
                       
//             }
//             else{ 
//                 System.out.print("*");
//             }
//         }
//         //2nd inner loop for the spaces b/w the left and right portion of the upper part of the pattern
//         for(int j=1;j<=(10-2*i);j++){ 
//             System.out.print(" ");
//         } 
//         //3rd inner loop for the spaces and stars of the right portion of the upper part of the pattern
//         for(int j=1;j<=i;j++){ 
//             if(i==3 && j==2 || i==4 && j==3 || i==4 && j==2 || i==5 && j==2 || i==5 && j==3 || i==5 && j==4){ 
//                 System.out.print(" ");
//             }
//             else{ 
//                 System.out.print("*");
//             }
//         }
//          System.out.println();
//     }
//   //loops for the lower part of the pattern exactly same as above except the outer loop i.e. i from 5 to 1 and i-- 
//     for(int i=5;i>=1;i--)
//     { 
//         for(int j=1;j<=i;j++){ 
//             if(i==3 && j==2 || i==4 && j==2 || i==4 && j==3 || i==5 && j==2 || i==5 && j==3 || i==5 && j==4){ 
//                  System.out.print(" ");
                       
//             }
//             else{ 
//                 System.out.print("*");
//             }
//         }
//         for(int j=1;j<=(10-2*i);j++){ 
//             System.out.print(" ");
//         } 
//         for(int j=1;j<=i;j++){ 
//             if(i==3 && j==2 || i==4 && j==3 || i==4 && j==2 || i==5 && j==2 || i==5 && j==3 || i==5 && j==4){ 
//                 System.out.print(" ");
//             }
//             else{ 
//                 System.out.print("*");
//             }
//         }
//          System.out.println();
//     }

        //2nd pattern pascals's triangle;
        //    1
        //   1 1
        //  1 2 1
        // 1 3 3 1 
        //1 4 6 4 1


      //   for(int i=1;i<=5;i++){ 
      //    for(int j=1;j<=(5-i);j++){ 
      //       System.out.print(" ");

      //    }
      //    for(int j=1;j<=i;j++){ 
      //       if(i==1 || j==i || j==1){ 
      //          System.out.print("1 ");   
      //       }
      //       else if(i==5 && j==3){ 
      //          System.out.print(i+1+" ");
      //       }
      //       else{ 
      //          System.out.print(i-1+" ");
      //       }
      //    }System.out.println();
      //   }
       
      //3rd pattern 
      //    1
      //   1 2
      //  1 2 3
      // 1 2 3 4 
      //1 2 3 4 5

      // for(int i=1;i<=5;i++){ 
      //    for(int j=1;j<=5-i;j++){ 
      //       System.out.print(" ");
      //    }
      //    for(int j=1;j<=i;j++){ 
      //       System.out.print(j+" ");
      //    }System.out.println();
      // }

      //4th pattern
      //1111
      //222
      //33
      //4

      // for(int i=1;i<=4;i++){ 
      //    for(int j=1;j<=(5-i);j++){ 
      //       System.out.print(i);
      //    }System.out.println();
      // }
   }
}
