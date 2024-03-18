import java.util.Scanner;

public class Lab03JPA01 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Input:");
        int number1 = number.nextInt();
        int  y=0;
        
             for (int i = 1; i <= number1; i++) {
                y = y+i;
            } 
            System.out.printf("1 + ... + %d = %d",(number1),(y));

            number.close();
    }
}