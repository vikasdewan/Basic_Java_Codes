import java.util.Scanner;

public class conditional_loops {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max=a;



//    Table of any number
//        int n = in.nextInt();
//        int m = in.nextInt();
//        for (int i = 1; i <= n; i++) {
//            System.out.println(m + " * " + i + " = " +i*m);
//        }

        //max between 3 numbers
//        int max =Math.max(c, Math.max(a,b));
//        System.out.println(max);
      if(b>max) {

          if (c > b) {
              System.out.println(c + " is the bigger number");
          }
              else{
                  System.out.println(b+ " is the biggest number");

          }
      }
      else{
          System.out.println(max+ " is the bigger number");
      }
    }
}