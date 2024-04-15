import java.util.*;
public class String1 {

  public static void main(String[] args) {
    
    // 1st method :String declaration
    // String name="vikas";
    // String full_name="vikas dewangan";//spaces are also considered in string
    // String senctence="My name is vikas dewangan since 2003";


     //2nd method :taking a String as input from the user
    
    //  Scanner sc=new Scanner(System.in);
    //  System.out.print("enter your name: "); 
    //  String name=sc.next();//take only one input
    //  System.out.print("enter your full name : "); 
    //  String fullname=sc.nextLine();//take input of that whole line
    //   System.out.println("your name is : "+name+" \n And full name is : "+fullname);

            // 3rd Method CONCATENATION
        //  String firstName="vikas";
        //  String lastName="dewangan";
        //  String full_Name=firstName + " " + lastName;//after this code run then " " get remove from memory as it is not store in memory
        //  System.out.println(full_Name);       
         

        //     // 4th method :LENGTH OF STRING
        //   //TO PRINT THE LENGTH OF THE STRING : System.out.println(nameOfString.length());
        //   System.out.println("length of the string");
        //   System.out.println(full_Name.length());//space is also count in the length of the string.
         
        //        //5th Method : TO PRINT THE CHARACTERS IN THE STRING INDIVIDUALLY
        //                 //charAt
        //       for(int i=0;i<full_Name.length();i++) {

        //         System.out.println(full_Name.charAt(i));
        //       }           


              //6th method :compare
            //   String name1="vikas";
            //   String name2="vikas";
              

              //1st case s1>s2 : +ve value
              // 2nd case s1==s2 : 0 
              // 3rd case s1<s2 : -ve value

            //   if(name1.compareTo(name2)==0){//here name1==name2 we can do this but this can fails sometime to see this run below comment
            //  //if(new String("vikas")== new String("vikas")) { 
            //     System.out.println("strings are equal");
            //   }
            //     else{ 
            //         System.out.println("strings are not equal");
            //     }
                
            //     System.out.println("Strings are equal");
            //   } else if(name1.compareTo(name2)>0) {
            //     System.out.println("Strings are not eqaul and String 1 is greater than string 2");
            //   }
            //      else if(name1.compareTo(name2)<0){ 
            //         System.out.println("strings are not equal and string 1 is less than string 2");
            //      }
 

                // 7th method : Substring
                // String sentence="My name is vikas dewangan";
                // String name = sentence.substring(11,sentence.length());//here 11 is the index no. of v and sentence.length give the last index no. of the String sentence
                //index n0. in string starts from 0 as like array.
                // System.out.println(name);

                // String sen="vikasdewangan";
                // String name1=sen.substring(0,5);//here endIndex is the no. 1 greater than that of you want like we want to print vikas so s is of 4th index but we have to write endindex 5 to print upto s.
                // System.out.println(name1);
                
                // String sen1="vikas dewangan";
                // String name2=sen1.substring(6);
                // System.out.println(name2);

                // 8th method :ParseInt Method of Integer class
                // String str="123";
                // int number=Integer.parseInt(str);//parseInt is a keyword
                // System.out.println(number);

                // 9th Method :  toString method of string class
                // int number=123;
                // String str=Integer.toString(number);
                // System.out.println(str.length());

                
                // //LAST THING : STRINGS ARE IMUTABLE...
            }
    
} 
