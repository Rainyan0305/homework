import java.util.Scanner;
public class JPA502 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        while (a != 999) {
        System.out.printf("Input n (0<=n<=16):");
        a = scanner.nextInt();
        long total = facTail(a,1);
        if (a >= 0 && a <= 16) {
        System.out.println(a + "的階層(迴圈) = " + total);
        System.out.println(a + "的階層(尾遞迴) = " + total);
        }
    }
        scanner.close();
    }
    public static long facTail(int a) {
        return facTail(a,1);
    }

    public static long facTail(int a,long b) {
        if(a == 1){ 
        return b;
        } else{
            return facTail(a-1, a*b);
        }
    }
}
