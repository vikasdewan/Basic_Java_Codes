import java.util.Scanner;

public class number_pyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter n = ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // number 
            for(int j = 1; j<=i ; j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}