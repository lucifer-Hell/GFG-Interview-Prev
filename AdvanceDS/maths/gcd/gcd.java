import java.util.*;
import java.io.*;
class gcd {

    // naive approach-->O(n)
    static int findGcd(int a,int b){
        int min=Math.min(a,b);
        int ans=1;
        for(int i=2;i<=min;i++){
            ans=(a%i==0 && b%i==0)?i:ans;
        }
        return ans;
    }
    // optimized approach--->O(log(min(a,b)))
    static int calcGCD(int a,int b){
        while(b!=0){
            int temp=a;
            a=b;
            b=a%b;
        }
        return a;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println(findGcd(a, b));
        System.out.println(calcGCD(a, b));
    }
}
