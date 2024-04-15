import java.util.Scanner;

public class JP103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        int sum = num1 + num2 + num3;
        
        double average = (double) sum / 3;
        
        System.out.printf("%d+%d+%d=%d\n", num1, num2, num3, sum);
        System.out.printf("%.2f", average);
        
        scanner.close();
    }
}
