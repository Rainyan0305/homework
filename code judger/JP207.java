import java.util.Scanner;
public class JP207 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(Prime(num)){
            System.out.println(num+"is a prime number");
        }else{
            System.out.println(num+"is not a prime number");
        }
        scanner.close();
    }
    public static boolean Prime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

