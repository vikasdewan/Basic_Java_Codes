import java.util.*;
public class Quicksort {
   

    // TIME COMPLEXCITY :  WORST CASE : O(n^2)
    //                  : Average case : O(nlogn)
    //  WORST CASE OCCURS WHEN PIVOT IS ALWAYS THE SMALLEST OR THE LARGEST ELEMENT OF THE ARRAY.
    // QUICK SORT PREFERRED OVER MERGE SORT AS IT DOESNOT REQUIRED EXTRA ARRAY FOR THE SORTING WHERE AS THE WORST CASE SENARIO IN THE QUICK SORT IS VERY RARY.
    public static int partition(int arr[],int low ,int high) { 
        int pivot = arr[high];
        int i= low-1;

        for(int j=low;j<high;j++) {
            if(arr[j] < pivot) { 
                i++;
                //swap logic
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        i++; //for the place in to put pivot in its right position
        //swap logic to put pivot in its right position
        int temp = arr[i]; 
        arr[i] = arr[high];
        arr[high] = temp;
        return i; // pivot index
        
    }
    public static void quickSort(int arr[], int low, int high) {

        if(low < high ) { 

            int pidx = partition(arr,low, high); 
            
            quickSort(arr,low,pidx-1);
            quickSort(arr, pidx+1, high);
        
        }
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
        quickSort(arr, 0, size-1);
       //print 
       System.out.print(" sorted array is : ");
       for(int k=0;k<size; k++) { 
        System.out.print(arr[k] + " ");
       }
       System.out.println();

    }
}
