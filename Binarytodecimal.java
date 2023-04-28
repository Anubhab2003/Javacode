
import java.util.Scanner;
public class Binarytodecimal {
    public static void bintodec(int bin){
        int mynum=bin;
        int dec=0;
        int pow=0;
        while(bin>0){
            int lastdgt=bin%10;
            dec=dec+(lastdgt*(int)Math.pow(2,pow));//Type casted
            pow++;
            bin=bin/10;
        }
        System.out.println("Decimal of "+mynum+"="+dec);

    }
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter your Binary Number");
        int b=s.nextInt();
        bintodec(b);
    }
    
}
