
import java.util.*;
import java.io.*;
class trailZero {
    // naive approach
    // will not work for no > 65
    static int giveZeroCount(int n ){
        // cal fac
        long fact=1;
        while(n!=0){
            fact*=n;
            n--;
        }
        
        int count=0;
        while(fact%10==0){
            count++;
            fact=fact/10;
        }
        return count;
    }
    // optimized apporach
    static long giveZero(int n){
        // rather then keep on dividing by 10
        // div by 5 ,25,..
        // so that you can find out how many 5,25,125 will least come in n
       
        long div=5;
        long c=0;
        while(true){
            long t=n/div;
            if(t==0)break;
            div*=5;
            c+=t;
        }
       
      
        return c;
    }
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(giveZero(n));
        // below wont run after  n=50 appx
        System.out.println(giveZeroCount(n));
    }   
}
