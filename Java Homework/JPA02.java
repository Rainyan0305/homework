import java.util.Scanner;

public class JPA02 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

            
                for (int i = 0; i < 2; i++) {
                    System.out.println("Input:");
                    int score1 = number.nextInt();
                    int score2 = number.nextInt();
    
                    if (score1 > score2) {
                        System.out.printf("%d is larger than %d\n", score1, score2);
                    }
                    else {
                        System.out.printf("%d is larger than %d\n", score2, score1);
                    }
                }
             
                number.close();
            
    }
}