import java.util.*;

class palin {
    static boolean isPalindrome(long no){
        long temp=0;
        int base =10;
        long j=no;
        while(j!=0){
            temp=temp*base+(j%10);
            // System.out.println("curr temp "+temp);
            // base*=10;
            j=j/10;  
        
        }
        
       
        if(temp==no)return true;
        else return false;
    }
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        long n=s.nextLong();
        System.out.println(isPalindrome(n));
    }   
}
