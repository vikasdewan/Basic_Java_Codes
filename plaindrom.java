public class plaindrom {
    public boolean isPalindrome(int x) {
        int r,sum=0,temp; 
        boolean ans = false;  
        int n=454;//It is the number variable to be checked for palindrome  
        
        temp=n;    
        while(n>0){    
         r=n%10;  //getting remainder  
         sum=(sum*10)+r;    
         n=n/10;    
        }    
        if(temp==sum) {   
         ans = true;
        }
         return ans;
    }
}
