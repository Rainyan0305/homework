import java.util.Scanner;
public class JP206 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int totla = 0;
        for (int i = num1; i <=num2; i++) {
            if(i%2==1){
                totla += i;
            }
        }
        System.out.println(totla);
        scanner.close();
    }
}
