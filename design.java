import java.util.Scanner;

public class design {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // no. of rows
        /*CODE FOR FLOYD,S TRIANGLE */
        // int number=1;
        // for (int i = 1; i <= n; i++) {
        //     for( int j = 1; j < i ; j++)
        //     {
        //         System.out.print(number+" ");
        //     number++;           }
        //     System.out.println();
        // }




        /*CODE FOR 1 ,0 TRIANGLE PATTERN */
      for (int i = 1; i <= n; i++) {
         for (int j = 1 ; j <= i; j++){
            int sum=i+j;
           if(sum%2==0){
            System.out.print("1 ");
           }
           else{
            System.out.print("0 ");
           }
         }
         System.out.println();        
      }
    }

}