import java.util.Scanner;

public class plaindrompattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    System.out.print("enter n = ");
       int n = in.nextInt();

       for (int i = 1; i <= n; i++) {
        //space
        for (int j =1 ; j <= n-i; j++) {
           System.out.print(" ");
        }
        //left half
        for (int j = i ; j >= 1; j--) {
            System.out.print(j);
        }
        //right half
        for (int j = 2; j <= i; j++) {
         System.out.print(j);   
        }
        System.out.println();
       }
        
    }
}
