
import java.util.*;
import java.io.*;
class noOfDigits {
    // naive appraoch
    static int digits(int n){
        int count=1;
        while((n/=10)!=0){count++;}
        return count;
    }
    // optimized approach
    static double digit(int n){

        return  Math.floor(Math.log10(n)+1);
    }
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(digit(n));
    }   
}
