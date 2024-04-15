import java.util.Scanner;
public class JP210 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(gcd(m, n));
        System.out.println(lcm(m, n));
        scanner.close();
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
    

