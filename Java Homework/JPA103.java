import java.util.Scanner;

public class JPA103 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please input:");
        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();
        double answer = (double) Math.round((x+y+z)/3.0*100)/100;
        System.out.printf("Average: %.2f",answer);
        s.close();
    }
}