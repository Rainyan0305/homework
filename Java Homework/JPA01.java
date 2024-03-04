import java.util.Scanner;

public class JPA01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

            for (int i=0; i<2; i++) {
                System.out.println("Please enter score:");
                int score = s.nextInt();

                if (score >= 60) {
                    System.out.println("You Pass");
                    System.out.println("End");
                }
                else {
                    System.out.println("End");
                }
            }
        
            s.close();
        
    }
}