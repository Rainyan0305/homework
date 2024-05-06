import java.util.Scanner;
public class JP308 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("");
    int num = scanner.nextInt();
    for(int i = num; i > 0; i--){
        System.out.println("fib("+i+")="+Fu(i));
    }
    scanner.close();
    }
    public static int Fu(int x){
        if (x == 0){
            return 0;
        } else if (x == 1){
            return 1;
        }else{
            int a = 0, b = 1, result = 0;
            for (int i = 2; i <= x; i++) {
                result = a + b;
                a = b;
                b = result;
            }
            return result;
        }
    }
}
