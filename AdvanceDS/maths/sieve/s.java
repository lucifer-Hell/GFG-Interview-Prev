import java.util.*;
class s{

    static boolean IsPrime(long n){
        if(n==1)return false;
        if( n==2 || n==3) return true;
        if(n%2==0 || n%3==0)return false;
        for(int i=5;i*i<=n;i+=6){
           if(n%i==0 || n%(i+2)==0)return false;
        }
        return true;
    
    }

    
    static void sieve(int n){
        int dp[]=new int[n+1];
        dp[0]=0;
        Arrays.fill(dp,1);
        for(int i=2;i*i<=n;i++){
            // solve
            if(dp[i]==0)continue;
            else{
                int idx=i*i;
                for(int j=idx;j<=n;j=j+i)dp[j]=0;
            }
        }
        for(int i=2;i<=n;i++){
            if(dp[i]==1) System.out.print(i+" ");
        }
    }

    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        sieve(n);
    } 
}