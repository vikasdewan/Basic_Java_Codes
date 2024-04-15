import java.util.HashSet;
import java.lang.module.FindException;
import java.util.*;
public class recursion2 {
    

        //TOWER OF HANOI  //TIME COMPX. : o(2^n)
    // public static void towerOfHanoi(int n , String src,String helper,String dest) { 
        

    //     if(n==1) { 
    //         System.out.println("transfer disk " + n + "from " + src + " to " + dest);
    //         return;
    //     }
    //     towerOfHanoi(n-1, src, dest , helper);//dest act as helper and helper here act as destination
    //     System.out.println("transfer disk " + n + " from " + src + " to " + dest);
    //     towerOfHanoi(n-1, helper, src, dest);
   
    // }


    // public static void main(String[] args) {
    //     int n=3;
    //     towerOfHanoi(n, "S", "H", "D");
    // }
    
    //2nd question : print the string in reverse
        //Time complexcity = O(n); where n represent the length of our string. 
    // public static void printRev(String str,int idx) { 
        
    //     if(idx==-1){ 
    //         return;
    //     }

    //     System.out.print(str.charAt(idx));
    //     printRev(str,idx-1);
    // }

    // public static void main(String[] args) {
    //     Scanner sc= new Scanner(System.in);
    //     System.out.println("enter the String to be reverse");
    //     String str = sc.nextLine();
    //     printRev(str, str.length()-1);
    // }


        //3rd question : find the 1st and last occurance of an element in sting
        //Time complexcity : O(n).

        // public static int first =-1;// -1  isliye liya kyuki ye index no. nahi hota hai as index no. starts from 0
        // public static int last =-1;

        // public static void findOccurance(String str,int idx,char element) { 

        //     if(idx  ==  str.length()) { 
        //         System.out.println("first occurance at index no. : "+ first);
        //         System.out.println("last occurance at index no.: "+ last);
        //         return;
        //     }
        //     char currChar = str.charAt(idx);
        //     if(currChar == element) { 
        //         if(first==-1) { 
        //             first= idx;
        //         }
        //         else { 
        //             last=idx;
        //         }
        //     }

        //     findOccurance(str, idx+1, element);
        // }

        // public static void main(String[] args) {
        //     Scanner sc=new Scanner(System.in);
        //     System.out.println("enter the String :");
        //     String str=sc.nextLine();
        //     char element = 'a';
        //     findOccurance(str, 0,element);
        // }




        // 4th question : CHECK IF AN ARRAY IS SORTED (sTRICTLY INCREASING )
        //TIME COMPLEXCITY : O(n).

        // public static boolean isSorted(int arr[],int idx) { 
        //     if(idx==arr.length-1) { 
        //         return true;
        //     }
        //     if(arr[idx] >= arr[idx+1])  {
        //          //arry is unsorted
        //          return false;
        //     }
        //        return isSorted(arr, idx+1);
        // }

        // public static void main (String args[]) { 
        //     Scanner sc= new Scanner(System.in);
        //    System.out.print("enter the size of the array : ");
           
        //    int size =sc.nextInt();
           
        //    int arr[]= new int[size];
           
        //    System.out.println("enter the elements of the array : ");

        //    for(int i=0;i<size;i++){ 
        //         arr[i] =sc.nextInt();
        //     }
        //     isSorted(arr,0);
        //     System.out.print("Is  the given array is sorted ?\nANSWER : ");
        //     System.out.println(isSorted(arr,0));
       
        // }


            //5th question : Move all 'x' to the end of the string ? given string : "axbcxxd"
            // Time complexcity : O(n + count.max==n) = O(n + n) = O(2n) = assmtotic notation i.e. =~ O(n)

            // public static void moveAllX(String str,int idx,int count ,String newString)  { 

            //     if(idx == str.length()) { 
                     
            //         for(int i=0;i<count;i++) { 
                         
            //             newString += 'x';
                       
            //         }   
            //             System.out.println("new string is : ");
            //             System.out.println(newString);
            //             return;
                    
            //     }

            //     char currChar = str.charAt(idx);

            //     if(currChar == 'x' ) { 
            //         count++;
            //         moveAllX(str, idx+1, count, newString);
            //     }
            //     else { 
            //         newString += currChar;
            //         moveAllX(str, idx+1, count, newString);
            //     }
            // }

            // public static void main(String[] args) {
                
            //     Scanner sc= new Scanner(System.in);
            //     System.out.println("enter the String");
            //     String str = sc.nextLine();
            //     moveAllX(str, 0, 0, "");
            // }



                // 6th question : Remove duplicates in a string
                // TIme complexcity : O(n).

                // public static boolean[] map = new boolean[26];

                // public static void removeDup(String str,int idx,String newString) { 
                     
                // if(idx == str.length()) {

                //     System.out.println(newString);
                //     return;
                // }
                
                //     char currChar = str.charAt(idx);
                //     if(map[currChar -'a']) { 
                //         removeDup(str, idx+1, newString);
                //     }
                //     else { 
                //         newString += currChar;
                //         map[currChar - 'a' ] = true;
                //         removeDup(str, idx+1, newString);
                //     }
        
                // }
                                   
                

                // public static void main(String[] args) {
                    
                //     Scanner sc= new Scanner(System.in);
                //     System.out.println("Enter the String");
                //     String str  = sc.nextLine();
                //     removeDup(str, 0, "");
                // }


                //****IMPORTANT QUESTION******// 7th question. 
                //PRINT ALL THE SUBSEQUENCES OF A STRING?  GIVEN STRING : "abc"
                //Time complexcity : O(2^n).

                    // public static void subSequences(String str, int idx, String newString)  { 

                    //     if(idx == str.length()) { 
                    //         System.out.println(newString);
                    //         return;
                    //     }
                    
                    // char currChar = str.charAt(idx);

                    // //to be
                    // subSequences(str, idx+1, newString + currChar );

                    // //or not to be
                    // subSequences(str, idx+1, newString);
                    // }

                    // public static void main(String[] args) {
                    //     String str = "abc";
                    //     subSequences(str, 0, "");
                    // }



                       //****IMPORTANT QUESTION******// 8th question. 
                //PRINT ALL THE UNIQUE SUBSEQUENCES OF A STRING?  GIVEN STRING : "aaa"
                //Time complexcity : O(2^n).

                // public static void subSequences(String str, int idx, String newString,HashSet<String> set)  { 

                //     if(idx == str.length()) { 
                        
                //         if(set.contains(newString)) { 
                //             return;
                //         }
                //         else { 
                //             System.out.println(newString);
                //             set.add(newString);
                //             return;
                //         }
                //     }
                
                // char currChar = str.charAt(idx);

                // //to be
                // subSequences(str, idx+1, newString + currChar,set );

                // //or not to be
                // subSequences(str, idx+1, newString,set);
                // }

                // public static void main(String[] args) {
                //     String str = "aaa";
                //     HashSet<String> set = new HashSet<>();
                //     subSequences(str, 0, "",set);
                // }



              // **** IMP ***** 9th PRINT KEYPAD COMBINATION  
              // 0 -> .   ,   1 -> abc  , 2 -> def  , 3 -> ghi , 4 -> jkl ,
              //5 -> mno  ,  6 -> pqrs  ,  7 -> tu   , 8 -> vwx  , 9 -> yz 

              //   TIME COMPLEXCITY : o(4^n).

                public static String keypad[] = {".", "abc", "def", "ghi","jkl","mno","pqrs","tu","vwx","yz"};

                public static void printComb(String str, int idx, String combination) { 
                    if(idx == str.length()) { 
                        System.out.println(combination);
                        return;
                    }

                    char currChar = str.charAt(idx);
                    String mapping = keypad[currChar - '0'];

                    for(int i=0;i<mapping.length(); i++) { 
                        printComb(str, idx+1, combination + mapping.charAt(i));
                    }
                }



                public static void main(String[] args) {
                    String str = "123"; //can do any combination ;like 43,4, 54, 453
                    printComb(str, 0, "");
                }
            }
