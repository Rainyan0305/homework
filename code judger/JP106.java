import java.util.Scanner;

public class JP106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < 6; i += 3) {
            System.out.printf("%10d %10d %10d\n", numbers[i], numbers[i + 1], numbers[i + 2]);
        }
        for (int i = 0; i < 6; i += 3) {
            System.out.printf("%-10d %-10d %-10d\n", numbers[i], numbers[i + 1], numbers[i + 2]);
        }

        scanner.close();
    }
}
