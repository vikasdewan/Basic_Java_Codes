import java.util.*;
import java.math.*;
public class calculator {
    public static void main(String[] args) {
        System.out.println("CALCLULATOR");
        System.out.println("1.Addition\n2.Subration\n3.Multiplication\n4.Division\n5.remainder\n");
        System.out.println("Enter the two values\t\t");
        Scanner sc= new Scanner(System.in);
        float c=0;
        float a= sc.nextInt();
        float b= sc.nextInt();
        System.out.println("enter the operation : \t");
        int opr = sc.nextInt();
        switch(opr)
        { 
            case 1 : c= a+b;
            System.out.println(c);
            break;
            case 2 : c= a-b;
            System.out.println(c);
            break;
            case 3 : if(b!=0){ 
                    c= a/b;
                     System.out.println(c);
                    break;
                    }
                     else { 
                        System.out.println("enter a valid no. for b");
                        break;
                     } 
            case 4 : c = a*b;
            System.out.println(c);
            break;
            case 5 : c = a%b;
            System.out.println(c);
            break;
            default : System.out.println("invalid operation applied");            
        }
    }
}
