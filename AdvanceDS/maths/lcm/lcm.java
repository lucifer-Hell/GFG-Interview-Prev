import java.util.*;
class lcm {
    
    // naive approach of lcm
    static int findLcm(int a,int b){
        int min=(a>b)?b:a;
        int max=(a>b)?a:b;
        for(int i=min;i>0;i++){
            if(i%min==0 && i%max==0)return i;
        }
        // this while never reach
        return 0;
    }
    //optimized approach
    static int findLcm2(int a,int b){
        // find gcd 
        int c=a;int d=b;
        while(d!=0){
            int temp=c;
            c=d;
            d=temp%c;
        }
        // lcm*hcf=a*b
        return ((a*b)/c);
    }
    public static void main(String args[]){
    // lcm 
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println(findLcm(a, b));
        System.out.println(findLcm2(a, b));
        
    }
}
