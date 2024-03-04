import java.util.Scanner;

public class JPA05 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
            for (int i = 0; i < 4; i++) {
                System.out.println("Enter an integer:");
                int number1;
                number1 = number.nextInt();

                if ((number1 % 2 == 0) & (number1 % 3 == 0) & (number1 % 6 == 0)) {
                    System.out.printf("%d是2、3、6的倍數\n", number1);
                } else if((number1 % 2 == 0) ){
                    System.out.printf("%d是2的倍數\n", number1);
                } else if((number1 % 3 == 0) ){
                    System.out.printf("%d是3的倍數\n", number1); 
                } else if((number1 % 6 == 0) ){
                    System.out.printf("%d是6的倍數\n", number1); 
                } else {
                    System.out.printf("%d不是2、3、6的倍數\n", number1); 
                }
            }
         
            number.close();
        
    }
}