import java.util.Scanner;

public class JPA501 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        while (a != 999) {
            System.out.printf("Input n (0<=n<=16): ");
            a = scanner.nextInt();
            if (a >= 0 && a <= 16) {
                System.out.printf(a + "的階層 = " + fac(a) + "\n");
            }
        }
        scanner.close();
    }

    public static int fac(int a) {
        if (a == 0) {
            return 1;
        } else {
            return a * fac(a - 1);
        }
    }
}
