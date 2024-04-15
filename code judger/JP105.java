import java.util.Scanner;
public class JP105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double result = Math.sqrt(x+y);
        System.out.printf("result=%.2f",result);
        scanner.close();
    }
    
}
