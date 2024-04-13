import java.util.Scanner;

public class fibbonaci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int a = 0;
       int b = 1;
       int temp;
        System.out.print("enter the number of terms : ");
        int n = in.nextInt();
        System.out.print(a + " "+ b + " ");
        for (int i = 1; i <= n-2; i++) {
            temp = b;
            b = b + a;
            a = temp;
            System.out.print(b+ " ");
        }
    }
}

