import java.util.Scanner;

public class Lab03JPA06 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        while (true) {
            System.out.println("Input:");
            int fr = number.nextInt();
            int multiple = number.nextInt();
            if (fr == 999) {
                break;
            }
            System.out.printf("%d%n",(int)Math.pow(fr, multiple));
        }
        number.close();
    }
}