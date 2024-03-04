import java.util.Scanner;

public class JPA04 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        
             for (int i = 0; i < 2; i++) {
                System.out.println("Input:");
                int number1 = number.nextInt();

                if ((number1%5==0) & (number1%9==0)) {
                    System.out.printf("Yes\n");
                }
                else {
                    System.out.printf("No\n");
                }
            
            } 
            number.close();
    }
}