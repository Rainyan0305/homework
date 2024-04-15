import java.util.Scanner;

public class JPA110 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.printf("");
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
            System.out.println(lcm(m, n));
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
    public static int lcm(int m, int n) {
        int m1 = m;
        int n1 = n;
        while(m % n != 0){
            int tmp = m % n;
            m = n;
            n = tmp;
        }
        return m1*n1 / n;
    }
}



