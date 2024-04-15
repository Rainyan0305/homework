import java.util.Scanner;
public class JPratice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] array = new int[3];
        for(int i = 0; i < 3; i++){
            array[i] = s.nextInt();
        }
        int total = array[0]+array[1]+array[2];
        double sum = total/3;
        System.out.printf("%d+%d+%d=%d\n", array[0], array[1], array[2],total);
        System.out.printf("%.2f",sum);
        s.close();
    }
}
