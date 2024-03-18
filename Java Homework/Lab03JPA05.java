import java.util.Scanner;

public class Lab03JPA05 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int number1 = 0;

        while (true) {
            System.out.print("Please enter a value between 1 and 10: ");

            number1 = number.nextInt();

            if (number1 >= 1 && number1 <= 10) {
                break; // Exit the loop if a valid value is entered
            } else {
                System.out.println("Error, the value is out of range.");
            }
        }

        int result = Result(number1);
        System.out.println("The result is: " + result);

        number.close();
    }

    public static int Result(int number1) {
        if (number1 == 0 || number1 == 1) {
            return 1;
        } else {
            return number1 * Result(number1 - 1);
        }
    }
}

