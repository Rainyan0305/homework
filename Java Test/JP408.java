import java.util.Scanner;

public class JP408 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("");
        String str1 = scanner.nextLine();
        System.out.print("");
        String str2 = scanner.nextLine();

       
        if (str1.length() < 4 || str1.length() > 20 || str2.length() < 4 || str2.length() > 20) {
            System.out.println("error");
        } else {
            System.out.println(str1.length());
            System.out.println(str2.length());

            String combinedReversed = new StringBuilder(str1 + str2).reverse().toString();
            System.out.println( combinedReversed);
        }

        scanner.close();
    }
}
