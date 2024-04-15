import java.util.Scanner;
public class JP107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.printf("%-10d\n",x);
        System.out.printf("%-10.2f\n",(x/2.0));
        System.out.printf("%-10.4f\n",(Math.pow(x/2.0,2)*3.1415));
        scanner.close();
    }
    
}
