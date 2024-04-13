import java.util.Scanner;

public class LinearSearchin_int {
    public static void main(String[] args) {
    int[] nums = {1 ,2 ,3 ,4 ,5 ,45};
      Scanner in = new Scanner(System.in);
      int target = in.nextInt();
      int ans = search(nums , target);
      System.out.println(ans);

    }
    static int search(int[] arr , int target){
        if (arr.length == 0)
        return -1;
        
        for (int index = 0; index < arr.length; index++) {
             int element = arr[index];
            if(element == target){
                return index;
            }
        }

        return -1;
    }

}
 