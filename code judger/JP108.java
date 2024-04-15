import java.util.Scanner;
public class JP108 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double Half = x/2.0;
        double total = (Math.pow(Half, 2)*3.1415);
        System.out.printf("%-10d\n",x);
        System.out.printf("%-10.2f\n",Half);
        System.out.printf("%-10.4f\n",total);
        scanner.close();
    }
}