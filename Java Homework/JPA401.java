import java.util.Scanner;
public class JPA401 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int [] i = new int[10];
        int m = 0;
        int sum = 0;
        System.out.println("請輸入10個整數:");
        for (int j = 0; j < 10; j++) {
            System.out.printf("第"+(j+1)+"個整數:");
            i[j] = number.nextInt();
            sum += i[j];

            if (i[j] >60) {
                m += 1;
            }
        }
        System.out.printf("陣列中大於60的有%d個",m);
        System.out.printf("\n總和為%d",sum);
        System.out.printf("\n平均值為%.6f",((double)sum/10));
        number.close();
    }
        
    }
