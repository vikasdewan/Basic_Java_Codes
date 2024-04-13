import java.util.Scanner;
public class homework {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
         // CODE FOR SOLID ROHMBUS
        // for (int i = n; i >= 1  ; i--) {/*--------> for (int i = 1; i <= n  ; i++) */
        //    for(int j = 1;j <= i-1 ; j++) {/*-----> for (int j = 1; j >= n-1  ; j++) */
        //     System.out.print(" ");
        //    }
        //    for(int k = 1;k <= n; k++ ){
        //     System.out.print("*");
        //    }
        //    System.out.println();
        // }

        // CODE FOR HOLLOW ROHMBUS :-)
        for (int i = n; i >= 1  ; i--) {/*--------> for (int i = 1; i <= n  ; i++) */
           for(int j = 1;j <= i-1 ; j++) {/*-----> for (int j = 1; j >= n-1  ; j++) */
            System.out.print(" ");
           }
           for(int k = 1;k <= n; k++ ){
            if(k==1||k==n||i==1||i==n){
            System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
           }
           System.out.println();
        }
    }
}
