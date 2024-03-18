import java.util.Scanner;

public class JPA104 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("輸入第1組的x和y座標:");
        int x = s.nextInt();
        int y = s.nextInt();
        System.out.print("輸入第2組的x和y座標:");
        int z = s.nextInt();
        int w = s.nextInt();
        double answer = (double) Math.sqrt(Math.pow(z-x,2)+Math.pow(w-y,2));
        double finalanswer = Math.round(answer*100.0)/100.0;
        System.out.printf("介於(%.2f,%.2f)和(%.2f,%.2f)之間的距離是%.2f",(double) x,(double)y,(double)z,(double)w,finalanswer);
        s.close();
    }
}
