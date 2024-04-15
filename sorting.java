import java.util.*;
public class sorting {
    public static void main(String[] args) {
        

        //three type of sorting
        //SELECTION SORTING
        //BUBBLE SORTING
        //Insertion SOrt

        //1ST SORTING BUBBLE SORTING
            // time complexity = O(n^2); 

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int size =sc.nextInt();
        int ary[]=new int[size];
        int temp=0;
        System.out.println("enter the array elements randomly");
        for(int i=0;i<size;i++) { 
 
            ary[i]=sc.nextInt();
        }
        System.out.println("array elements are : ");
        for(int i=0;i<size;i++) { 
            System.out.print(ary[i]+" ");
        }
        System.out.println();

         System.out.println("sorted array is");
        // for(int i=0;i<size-1;i++) { 
        //     for(int j=i+1;j<size;j++){ //can also do : for(int j=0;j<size-i-1;j++)
        //         if(ary[i]>ary[j]) { //   if(ary[j]>ary[j+1]){ 
        //            temp=ary[j];      //   int temp=ary[j];
        //            ary[j]=ary[i];    //   ary[j]=ary[j+1];
        //            ary[i]=temp;      //   ary[j+1] = temp;

        //         }
        //         else {               
        //             continue;
        //         }
        //     }                               //after sorting for printing you can also make a print function and pass the ary in it for printing.
        // }
        // for(int i=0;i<size;i++) {
        //     System.out.print(ary[i]+ " ");
        // }
         

                //2ND SELECTION SORTING
                //time complexity = O(n^2);
            // int smallest=0;
            // for(int i=0;i<size-1;i++) { 
            //     smallest=i;
            //     for(int j=i+1;j<size;j++) { 
            //         if(ary[smallest]>ary[j]) { 
            //             smallest=j;
            //         }
            //     }   
            //         temp=ary[i];
            //         ary[i]=ary[smallest];
            //        ary[smallest]= temp;
            //     }
            
            //     for(int i=0;i<size;i++) { 
            //         System.out.print(ary[i]+ " ");
            //     }


                    //3rd INSERTION SORTING
                    // time complexity = O(n-1)
                //   for(int i=1;i<size;i++) {
                //     int current= ary[i];
                //     int j=i-1;
                //     while(j>=0 && current < ary[j]) {
                //         ary[j+1] = ary[j];
                //         j--;
                //     }

                //     //placement
                //     ary[j+1]=current;
                // }
                // for(int i=0;i<size;i++) { 
                //         System.out.print(ary[i]+ " ");
                //      }

    }
     
}
