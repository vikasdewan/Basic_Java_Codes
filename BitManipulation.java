import java.util.*;
public class BitManipulation {

    public static void main(String[] args) {
        
    // 0000=0, 0001=1,0010=2......
    // we have four type of bit manipulation.
    // 1. Get
    // 2. Set
    // 3. Clear
    // 4. Update

    //we use bitwise leftshift or rightshift for the bit manipulation

      //GET BIT

    // 1st ques: Get the 3rd bit (position=2) of a number n. (n=0101);
    //index no. of the bits are from right to left.
    //process for GET BIT  : 1. bitmask : 1<<i
    //                       2. operatin : AND
    // int n=5;// here we know that 5=0101 in binary
    // int pos=2; // position given in question
    // int bitMask= 1<<pos;//bitmask given accordingly for this question
      
    //   if((bitMask & n)==0) {//here 0100 & 0101 == 0100  i.e a non zero no. here it is 0100=4 so it is else condition
    //     System.out.println("bit was zero");
    //   }
    //   else  {
    //     System.out.println("bit was one");
    //   }

        //SET BIT

      // Set the 2nd bit(position=1) of a number n.(n=0101)
      //  process for SET BIT : 1. BitMask : 1<<i
      //                        2. operation : OR
      //(in SET bit ,we set the given position bit into one)
    //   int m=5;//0101
    //   int posi=1;//given in question
    //   int bitMask1 = 1<<posi;// 1 changes to 0010.
    //   int newNumber= bitMask1 | n;//0010 | 0101 = 0111 (7 in decimal no. system).
    //   System.out.println(newNumber);// newNumber =7;

          //CLEAR BIT

      // Clear the 3rd bit ( position =2) of  a number n. (n=0101).
      // process for CLEAR bit: 1. BItMask : 1<<i.
      //                        2. Make NOT of BitMask by using complimentary operator (~)
      //                        3. then perform Operation : AND
    //    int n=5;//0101;
    //    int pos=2;
    //    int bitMask=1<<pos;//0001 << 2 ==>  0100
    //    int notBitMask = ~(bitMask);
    //    int newNumber = notBitMask & n;
    //    System.out.println(newNumber);

              //UPDATE BIT

       // Update the 2nd bit(position =1) of a number n to 1. (n=0101) 
       //Process for Update bit : there are two cases for the Update
       //  for 0                       for 1
       // Clear BIT                  SET BIT
       // 1. bitMask=1<<i;            1. bitMask : 1<<i;
       // 2. Operation= AND           2. Operation : OR
       //   with NOT  
    //   Scanner sc= new Scanner(System.in);
    //   System.out.println("enter the operation to be update ");
    //   int oper = sc.nextInt();
    //    int n=5;//0101==>5
    //    int pos=1;

    //    int bitMask=1<<pos;

    //    if(oper==1){ 
    //     // SET BIT
    //    int newNumber= bitMask | n;
    //    System.out.println(newNumber);
    //     }
    //      else { 
    //         //CLEAR BIT 
    //         int notBitMask = ~(bitMask);
    //         int newNumber = notBitMask &  n;
    //         System.out.println(newNumber);
    //      }
}
}
