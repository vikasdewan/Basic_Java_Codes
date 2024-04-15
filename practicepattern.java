public class practicepattern {
    public static void main(String[] args) {
        //pattern 
        //    *****
        //   *****
        //  *****
        // *****
        //***** 
        // int i;
        // int k,j;
        //  for(i=1;i<=5;i++){
        
            
        //      for( j=1;j<=5-i;j++){
        
            
        //          System.out.print(" ");
        
        
        //  }
        
        
        //      for( k=1;k<=5;k++){ 
        
        //        // if(k==1 || j==1 || k==5 || j==5 ) use this if else to print only outer stars i.e. borders           
        //          System.out.print("*");
        //         //else
        //           //  System.out.print(" ");

                       
        //  }System.out.println();
        
        
    //  }
         
        //2nd pattern
        //     1
        //    2 2
        //   3 3 3 
        //  4 4 4 4
        // 5 5 5 5 5     
          
        // for(int i=1;i<=5;i++){ 
        //     //for spaces
        //      for(int j=1;j<=5-i;j++){ 
        //         System.out.print(" ");
        //      }
        //      //for numbers
        //      for(int j=1;j<=i;j++){ 
        //         System.out.print(i+" ");
        //      }System.out.println();
        // }
 
               //3rd pattern    PALINDROMIC PATTERN   
             //ese pattrn jo aage se aur piche se same dikenge 
         //        1
         //      2 1 2
         //    3 2 1 2 3
         //  4 3 2 1 2 3 4
         //5 4 3 2 1 2 3 4 5              
            // int n=5;
            // for(int i=1;i<=n;i++){ 
            //     //for spaces
            //     for(int j=1;j<=(n-i);j++){
            //         System.out.print("  ");
            //     }
            //     // for 1st half pattern i.e.
            //     //    1
            //     //  2 1
            //     //3 2 1
            // //  4 3 2 1 
            // //5 4 3 2 1
            //     for(int j=i;j>=1;j--){ 
            //         System.out.print(j+" ");
            //     }
            //     //for 2nd half of the pattern
            //     for(int j=2;j<=i;j++){  
            //         System.out.print(j+" ");
            //     }
            //     System.out.println();

            // }        


                //DIAMOND PATTERN
                //   *
                //  ***
                // *****
                //******* 
                //******* 
                // *****
                //  ***
                //   *
                //loops for the upper portion of the pattern
                //  int n=4;
                //  for(int i=1;i<=n;i++){ 
                //     for(int j=1;j<=(n-i);j++){
                //         System.out.print(" ");
                //     }
                //     for(int j=1;j<=(2*i-1);j++){ 
                //         System.out.print("*");
                //     }System.out.println();
                //  }  
                //  //loop for the low portion of the pattern
                //  for(int i=n;i>=1;i--){ 
                //     for(int j=1;j<=(n-i);j++){ 
                //         System.out.print(" ");
                //     }
                //     for( int j=1;j<=(2*i-1);j++){ 
                //         System.out.print("*");
                //     }System.out.println();
                //  }
    }
}
