import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        /* METHOD 1 FOR FACTORIAL */
        int fact = in.nextInt();
        
        for (int i = (fact-1); i > 0; i--) {
            fact=fact*i;
        }

        /* METHOD 2 FOR FACTORIAL */
        // int n = in.nextInt(); int fact=1;
        // for (int i = 1; i <= n; i++) {
        //     fact = fact * i;
        // }
        
        System.out.println(fact);
    }
}
