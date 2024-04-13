import java.util.Scanner;

public class armstrong {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int a = in.nextInt();
   boolean answer = arms(a);
   System.out.println(answer);
   
  }  
  static boolean arms(int num){
     
    int dig ; 
    int check=0;
    int originalnumber = num;
    for (int i = 0; num!=0 ; i++) {
      dig = num % 10;
      num = num / 10;
      check = check + dig*dig*dig;
       
    }
    if(originalnumber == check){
return true;      }
      else {
return false;      }
// if(originalnumber!=check)
// return false;
  }

}
