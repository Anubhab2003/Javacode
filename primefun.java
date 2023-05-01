import java.util.*;
public class primefun {
    public static boolean prime(int n){
        if (n==2){
            System.out.println("Prime Number");
            return true;
        }
        else{
            boolean isprime= true;
            for(int i=2;i<=n-1;i++){
                if(n%i==0){
                    isprime= false;
                    break;
                }
            }   
            if(isprime){
                System.out.println("Prime Number");
            }
            else{
                System.out.println("Not a Prime Number");
            }
            return isprime;
        }
    }   
    public static void main(String args[]){
        System.out.println(prime(5));
        System.out.println(prime(2));
        System.out.println(prime(14));
        System.out.println(prime(11));

    }   
}
