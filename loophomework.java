import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class loophomework {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      int n=sc.nextInt();
      int i;
      
 

    //   System.out.println("all even numbers till  "+n+"is:\t");
    //   for(int i=1;i<=(n/2);i++){ 
    //       System.out.println(2*i);
    //     )        if(n%i==0);       

    //     break;
    
    
   for(i=2;i<n;i++){ 
    if(n%i==0)
    break;
   }
    if(i==n)
      System.out.println("a prime number");
      else
      System.out.println("not a prime number");
    }

}
