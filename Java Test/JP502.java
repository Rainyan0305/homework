import java.util.Scanner;
public class JP502 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        long number = scanner.nextLong();

        String numStr = Long.toString(number);
        long result = 1;

        for(int i =0; i<numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            System.out.print(digit);
            if(i < numStr.length()-1){
                System.out.print("*");
            }else{
                System.out.print("=");
            }
            result *= digit;
    }
    System.out.println(result);
    scanner.close();
    }
}
