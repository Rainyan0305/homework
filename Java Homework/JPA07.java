import java.util.Scanner;

public class JPA07 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        
            for (int i = 0; i < 4; i++) {
                System.out.print("請輸入三個整數:");
                int number1 = number.nextInt();
                int number2 = number.nextInt();
                int number3 = number.nextInt();

                if ((number1+number2 > number3)||(number2+number3 > number1) || (number1+number3 > number2)) {
                    System.out.printf("不可以構成三角形\n");
                }
                else if((Math.pow(number1, 2)+Math.pow(number2, 2)==Math.pow(number3,2))||(Math.pow(number3, 2)+Math.pow(number2, 2)==Math.pow(number1,2))||(Math.pow(number1, 2)+Math.pow(number3, 2)==Math.pow(number2,2))) {
                    System.out.printf("直角三角形\n");
                }else if((Math.pow(number1, 2)+Math.pow(number2, 2)<Math.pow(number3,2))||(Math.pow(number3, 2)+Math.pow(number2, 2)<Math.pow(number1,2))||(Math.pow(number1, 2)+Math.pow(number3, 2)<Math.pow(number2,2))) {
                    System.out.printf("鈍角三角形\n");
                }else if((Math.pow(number1, 2)+Math.pow(number2, 2)>Math.pow(number3,2))&(Math.pow(number3, 2)+Math.pow(number2, 2)>Math.pow(number1,2))&(Math.pow(number1, 2)+Math.pow(number3, 2)>Math.pow(number2,2))) {
                    System.out.printf("銳角三角形\n");
                }
            }
            number.close();
    }
}