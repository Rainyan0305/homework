import java.util.Scanner;

public class JPA012 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("請輸入：");
        int x = s.nextInt();
        double y = x * 2.20462;
        System.out.println(String.format("%.6f 公斤 = %.6f 磅", (double) x, y));
        s.close();
    }
}

