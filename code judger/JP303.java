import java.util.Scanner;
public class JP303 {
    public static int compute(int n) {
        if (n <= 1) {
            return 0; 
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0; 
            }
        }
        return 1;
    }
                 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(compute(n)==1) {
            System.out.println(n+" is a prime number");
        }else if(compute(n) == 0) {
            System.out.println(n+" is not a prime number");
        }
        scanner.close();
    }
}
