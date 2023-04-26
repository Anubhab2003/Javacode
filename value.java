import java.util.*;
public class value{
    public static int product(int m , int n){
        int c=m*n;
       // System.out.println(m*n);
        return c;
    }
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter two number");
        int a=s.nextInt();
        int b=s.nextInt();
        int p=product(a,b);
        System.out.println("product is "+p);
    }
}