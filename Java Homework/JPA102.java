import java.util.Scanner;

public class JPA102
 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Input：");
        int x = s.nextInt();
        double y = x * 2.20462;
        System.out.println(String.format("%.1f kg = %.4f ponds", (double) x, y));
        s.close();
    }
}

