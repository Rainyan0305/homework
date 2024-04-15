import java.util.Scanner;

public class Jp208 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        int n = scanner.nextInt();
        for (int i = 2; i < n; i++) {
            boolean isPrime = true; 

            int j = 2;
            while (j * j <= i) {
                if (i % j == 0) {
                    isPrime = false; 
                    break;
                }
                j++;
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
