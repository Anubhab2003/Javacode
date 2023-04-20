import java.util.*;

public class prime {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        if (n == 2) {
            System.out.println("Yes, it's a prime number");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                System.out.println("Yes, the given number is prime");
            } else {
                System.out.println("The number is composite");
            }
        }
    }
}

