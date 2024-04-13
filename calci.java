import java.util.Scanner;

public class calci {
        public static void main(String[] args) {
            
            Scanner in = new Scanner(System.in);
            int ans = 0;
            while(true)
            {     System.out.print("Enter the operator : ");
                char op = in.next().trim().charAt(0);
                if(op == '+' || op == '-' || op == '/'|| op =='*' || op == '%' ){
                    System.out.print("Enter a 1st number : ");
                  int num1 = in.nextInt();
                    System.out.print("Enter the 2nd number : ");
                  int num2 = in.nextInt();

                  if(op == '+'){
                     ans = num1 + num2 ;
                  }
                  if(op == '*'){
                     ans = num1 * num2 ;
                  }
                  if(op == '/'){
                    if(num2 != 0){
                     ans = num1 / num2 ;
                    }
                    else{
                        System.out.println("not defined");
                        continue;
                    }
                    
                }
                  if(op == '-'){
                     ans = num1 - num2 ;
                  }
                  if(op == '%'){
                     ans = num1 % num2 ;
                  }
                
                }
                else if(op == 'x' || op == 'X'){
                    break;
                }
                else{
                    System.out.println("invalid operator");
                    continue;
                }
                System.out.print("your ans is : ");
                System.out.println(ans);
            
        }
    
     }
    }
    

