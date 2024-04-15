import java.util.Scanner;
public class JP301 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        for (int i = 0; i <y; i++) {
            for (int k = 0; k < x; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(x*y);
        scanner.close();
    }
}
