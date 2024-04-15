import java.util.Scanner;

public class JP209 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            horizontalFirst();
        } else if (choice == 0) {
            verticalFirst();
        } else {
            System.out.println("error");
        }
        
        scanner.close();
    }
    public static void horizontalFirst() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " x " + i + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }
    public static void verticalFirst() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + " x " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
