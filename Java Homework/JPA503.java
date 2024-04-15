import java.util.Scanner;

public class JPA503 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.printf("Input m :");
            int m = s.nextInt();
            if (m == 999) {
                break;
            }
            System.out.printf("Input n :");
            int n = s.nextInt();
            if (m < n) {
                int temp = m;
                m = n;
                n = temp;
            }
            System.out.println("最大公因數="+gcd(m, n));
        }
        s.close();
    }

    public static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            return gcd(n, m % n);
        }
    }
}