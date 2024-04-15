import java.util.Scanner;

public class JP306 {
    public static int compute(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * compute(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        int n = scanner.nextInt();
        int result = compute(n);
        System.out.println(n + "!=" + result);
        scanner.close();
    }
}
