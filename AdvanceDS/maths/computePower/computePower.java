import java.util.*;
class computePower {
    
    static  long cp (long n,long pow){
        if(pow==0)return 1;
        if(pow==1)return n;
        if(pow%2==0){
            long ans=cp(n, pow/2);
            return ans*ans;
        }else{
            long ans=cp(n, (pow-1)/2);
            return ans*ans*n;
        }
    }
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        long n=s.nextLong();
        long pow=s.nextLong();
        System.out.println(cp(n,pow));
    }   
}
