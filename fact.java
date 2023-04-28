import java.util.*;

public class fact{
    public static int facto(int m) {
        int n = 1;
        for (int i = 1; i <= m; i++) {
            n *= i;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number n and r of binomial coefficient");
        int n = s.nextInt();
        int r = s.nextInt();
        int nfact=facto(n);
        int rfact=facto(r);
        int c=r-n;
        int nmrfact=facto(c);
        System.out.println("n="+nfact);
        System.out.println("r="+rfact);
        System.out.println("n-m factorial="+nmrfact);
        int b=nfact/(rfact*nmrfact);
        System.out.println("Binomial Coefficient"+b);

    }
}
