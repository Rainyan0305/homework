import java.util.Scanner;
public class JP309 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numbers = new int[6];
        for (int i = 0; i < 6; i++) {
            numbers[i] = s.nextInt();
        }

        double min = compute(numbers);
        System.out.printf("%.3f",min);
        s.close();
    }
    public static double compute(int[] numbers) {
        double Den1 = (double)numbers[0]/numbers[3];
        double Den2 = (double)numbers[1]/numbers[4];
        double Den3 = (double)numbers[2]/numbers[5];
        double min = Den1;
        if (Den2 < min) {
            min = Den2;
        }

        if(Den3 < min) {
            min = Den3;
        }

        return min;
    }
    
}
