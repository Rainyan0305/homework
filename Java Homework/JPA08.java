import java.util.Scanner;

public class JPA08 {
    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("Input:");
                int number1 = score.nextInt();

                if (number1>=90) {
                    System.out.printf("Your grade is A\n");
                }
                else if (80<=number1 && number1<90) {
                    System.out.printf("Your grade is B\n");
                } else if (70<=number1 && number1<80) {
                    System.out.printf("Your grade is C\n");
                } else if (60<=number1 && number1<70) {
                    System.out.printf("Your grade is D\n");
                } else if (number1<60) {
                    System.out.printf("Your grade is F\n");
                }
            }
        } finally {
            score.close();
        }
    }
}