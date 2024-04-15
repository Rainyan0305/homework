import java.util.Scanner;
public class JP308{
    public static int compute(int n){
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int a = 0, b = 1, result = 0;
            for (int i = 2; i <= n; i++) {
                result = a + b;
                a = b;
                b = result;
            }
            return result;
        }
    }
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.println("");
        int n = number.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.println("fib("+i+")="+compute(i));
        }
        number.close();
    }
}