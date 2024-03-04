import java.util.Scanner;

public class JPA03 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        
            for (int i = 0; i < 2; i++) {
                System.out.println("Input:");
                int oddoreven = number.nextInt();

                if (oddoreven%2==0) {
                    System.out.printf("The number is even.\n", oddoreven);
                }
                else {
                    System.out.printf("The number is odd.\n", oddoreven);
                }
            }
         
            number.close();
    }
}