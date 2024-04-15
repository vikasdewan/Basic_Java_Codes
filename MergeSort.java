import java.util.*;
public class MergeSort {
    
    //TiME COMPLEXCITY OF THE CODE : o(n * logn).

    public static void conquer(int arr[] ,int si ,int mid ,int ei ) { 
        int merged[] =new int[ei - si +1];

        int idx1 = si; // to tarack the index of the 1st array.
        int idx2 = mid+1; // to track the index of 2nd array.
        int x = 0; // to track the index of merge
        while ( idx1 <= mid && idx2 <=ei ) { 
            if(arr[idx1] <= arr[idx2]) { 
                merged[x++] =  arr[idx1++]; // ++ to increase the value after using the value of that variable.
            }
            else { 
                merged[x++] = arr[idx2++];
            }
        }


        //only one of the below loop will active because some element can be left in either 1st array or 2nd array 
        //so to add those elements we use these loops.
        while(idx1 <= mid) { 
            merged[x++] = arr[idx1++];
        }
        while(idx2 <= ei ) { 
            merged[x++] = arr[idx2++];
        }


        for(int i=0 , j=si ; i<merged.length ; i++ , j++) { 
            arr[j] = merged[i];
        }
    }


    public static void divide(int arr[],int si,int ei) { //si => starting index and ei => ending index
        if(si >= ei) { 
            return;
        }


      int   mid = si + (ei - si)/2; //we do this instead of (si + ei)/2 because sometime due to large value of si and ei there sum exceeds the integer type
      divide(arr , si , mid);
      divide(arr , mid+1 , ei);
      conquer(arr, si, mid, ei);

    }
    
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the array :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the elements of the array :");
        for(int i=0;i<size;i++) { 
             arr[i] = sc.nextInt();
        }
        divide(arr, 0, size-1);
       //print 
       System.out.print(" sorted array is : ");
       for(int k=0;k<size; k++) { 
        System.out.print(arr[k] + " ");
       }
       System.out.println();

    }
}
