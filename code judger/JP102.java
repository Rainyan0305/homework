import java.util.Scanner;
public class JP102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        int i = scanner.nextInt();
        double total =(i*23.34);
        System.out.printf("%.2f",total);
        scanner.close();
    }
}
