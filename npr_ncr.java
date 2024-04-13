
   import java.util.Scanner;

   public class npr_ncr {

        public static void main(String args[]) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the value of n: ");
            int n = scanner.nextInt();
            System.out.print("Enter the value of r: ");
            int r = scanner.nextInt();

            if (n < r || n < 0 || r < 0) {
                System.out.println("Invalid input. Please enter non-negative integers with n >= r.");
                return;
            }

            // Calculate factorial of n
            int nFactorial = 1;
            for (int i = 1; i <= n; i++) {
                nFactorial *= i;
            }

            // Calculate factorial of n-r
            int nMinusRFactorial = 1;
            for (int i = 1; i <= n - r; i++) {
                nMinusRFactorial *= i;
            }

            // Calculate factorial of r
            int rFactorial = 1;
            for (int i = 1; i <= r; i++) {
                rFactorial *= i;
            }

            // Calculate NPR and NCR
            int npr = nFactorial / nMinusRFactorial;
            int ncr = npr / rFactorial;

            System.out.println("NPR (Permutation) of " + n + " and " + r + " is: " + npr);
            System.out.println("NCR (Combination) of " + n + " and " + r + " is: " + ncr);
        }
    }


