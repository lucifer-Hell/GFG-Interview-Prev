import java.util.*;
class factor {

    static void factor(long n){
            // prime factors will only be till root n
            System.out.print(1);
            for(long i=2;i*i<=n;i++){
                while(n%i==0){
                    System.out.print("*"+i);
                    n=n/i;
                }
            }
            if(n>1)
            System.out.print("*"+n);

    }


    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        long n=s.nextLong();
        factor(n);
    }   
}
