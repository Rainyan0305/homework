import java.util.Scanner;

public class JPA402 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.printf("請輸入學生人數:");
        int a =0;
        double sum = 0;
        a = number.nextInt();
        double [] i = new double[a];
        for (int j = 0; j < a; j++) {
            System.out.printf("第"+(j+1)+"個學生的成績:");
            i[j] = number.nextDouble();
            sum += i[j];
        }
        System.out.printf("人數%d",a);
        System.out.printf("\n總和為%.2f",sum);
        System.out.printf("\n平均為%.6f",sum/a);
        number.close();

        }
    
}
