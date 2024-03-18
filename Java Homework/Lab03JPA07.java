import java.util.Scanner;

public class Lab03JPA07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Input:");
            int m = s.nextInt();
            if (m == 999) {
                break;
            }
            int n = s.nextInt();
            if (m < n) {
                int temp = m;
                m = n;
                n = temp;
            }
            System.out.println(gcd(m, n));
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

