import java.util.*;


public class practicearray1 {
    public static void main(String[] args) { 
 Scanner sc=new Scanner(System.in);
 //Take an array of names as input from the user and print them on the screen;
// System.out.println("ENter the size of the array");
//  int size=sc.nextInt();
//  String names[]=new String[size];
//  System.out.println("enter the names :");
//  for(int i=0;i<size;i++) {
//     names[i]=sc.nextLine();
//  }
//  System.out.println("enter names by the user are: ");
//  for(int i=0;i<names.length;i++){ 
//     System.out.println(names[i]+" ");
//  }

    //find the maximum and minimum numbr in an array of integers.
//     System.out.println("enter the size of the array");
//     int size=sc.nextInt();
//     int num[]=new int[size];
    
//     System.out.println("enter the elements of the array: ");
//     for(int i=0;i<size;i++){ 
//         num[i]=sc.nextInt();
//     }
//    int max=Integer.MIN_VALUE;//Assigning the max and min values to the program made codes
//    int min=Integer.MAX_VALUE;

//     for(int i=0;i<num.length;i++){ 
//         if(num[i]<min){ 
//             min=num[i];
//         }
//         if(num[i]>max){ 
//             max=num[i];
//         }
//     }

//     System.out.println("maximum and minimum number in an array of integers are "+max+" and "+min+" respectiviely.")

     
        //TAKE AN array of numbers as input and check if it is an array sorted in ascending order;
         
        System.out.println("enter the size of the array");
        int size =sc.nextInt();
        int num[]=new int[size];
        System.out.println("enter the elements of the array:");
        for(int i=0;i<size;i++){ 
            num[i]=sc.nextInt();
        }
        int FLAG=0; //can also user :boolean isAscending=true;
        for(int i=0;i<size-1;i++){ 
            if(num[i]>num[i+1]){ 
                    FLAG=1;//can also use: isAscending=false;
                    break;
            }
            else{ 
                continue;
            }
        }
        if(FLAG==1){ //can also use :  if(isAscending){ sout....sorted} els {  not sorted}
            System.out.println("the array is not sorted in ascending order");
        }
        else{ 
            System.out.println("array is sorted in ascending order");
        }
    }   
}