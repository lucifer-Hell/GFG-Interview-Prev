import java.util.*;

public class prime {

    // naive sieve 
    static boolean isPrime(long n){
        if(n==1)return false;
        if( n==2 || n==3) return true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)return false;
        }
        return true;
    }
    // optimized sieve
    // if we observe except 2 and 3 only 5 and 7 are primes left 
    // so in 1..10 if a no is not div by 2 and 3
    // then we should only check it for 5 and 7
    static boolean optimizedIsPrime(long n){
        if(n==1)return false;
        if( n==2 || n==3) return true;
        if(n%2==0 || n%3==0)return false;
        for(int i=5;i*i<=n;i+=6){
           if(n%i==0 || n%(i+2)==0)return false;
        }
        return true;
    
    }
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        long n=s.nextLong();
        System.out.println(optimizedIsPrime(n));
        System.out.println(isPrime(n));
    }   
}
