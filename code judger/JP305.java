import java.util.Scanner;
public class JP305 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int i [] = new int[6];
        int m = 0;
        for (int j = 0; j < 6; j++) {
            System.out.print("");
            i[j] = number.nextInt();
            if (i[j] %3 == 0) {
                m += 1;
            }

            }
        System.out.println(m);
        number.close();
    }
}
    

