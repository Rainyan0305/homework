import java.util.Scanner;
public class JP104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        System.out.printf("total=%.2f",(x+y));
        scanner.close();
    }
    
}
