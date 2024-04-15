public class Pattern2 {
  public static void main(String[] args) {
    
  
    //butterfly pattern
    //*      * 
    //**    ** 
    //***  *** 
    //******** 
    //******** 
    //***  *** 
    //**    ** 
    //*      * 
    //first for loops are for to print the upper symmetric portion
      for(int i=1;i<=4;i++){ 
       //inner loop for left pattern of upper part
        for(int j=1;j<=i;j++){ 
            System.out.print("*");
        } 
        //loop for spaces........for space trick=2*(4-i)
           for(int k=1;k<=2*(4-i);k++){ 
                System.out.print(" ");
        }   
        //loop for right pattern of upper part

                for(int l=1;l<=i;l++){
                    System.out.print("*");
        } System.out.println(); 
            
    }
    
         for(int i=4;i>=1;i--){ 
             
            for(int j=1;j<=i;j++){ 
                System.out.print("*");
            }
             
            for(int k=1;k<=2*(4-i);k++){ 
                System.out.print(" ");
             } 
             
             for(int l=1;l<=i;l++){ 
                System.out.print("*");
             }
             System.out.println(); 
        
             
         }
    }
} 



