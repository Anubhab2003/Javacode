import java.util.*;

public class dectobin {
    public static void dectobinary(int dec) {
        int mydec = dec;
        int bin = 0;
        int pow = 0;
        while (dec > 0) {
            int rem = (dec % 2);
            bin = bin + (rem * (int) Math.pow(10, pow));
            pow++;
            dec /= 2;
        }
        System.out.println("Binary form of " + mydec + " = " + bin);
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int x = s.nextInt();
        dectobinary(x);
    }
}
