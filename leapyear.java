import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in. nextInt();
        if(year%4==0)
        {
            if(year%100 == 0){
                if(year % 400==0){
                System.out.println(year+ " is a leap year");
            }
            else{
            System.out.println("the year "+ year + " is not a leap year");
           }
        }
           else{
            System.out.println("the year "+ year + " is a leap year");
           }
        }
        else{
            System.out.println("this is not a leap year");
        }
    }
}
