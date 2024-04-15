import java.util.Scanner;
public class JP310 {
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int digitCount = countDigits(number);
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digitCount);
            number /= 10;
        }
        return sum == originalNumber;
    }

    public static int compute(int n) {
        int[] armstrongNumbers = new int[n]; 
        int index = 0; 
        int sum = 0; 

        for (int i = 1; i < n; i++) {
            if (isArmstrong(i)) {
                armstrongNumbers[index] = i;
                index++;
                sum += i;
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.println(armstrongNumbers[i]);
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("");
        int n = number.nextInt();
        int sum = compute(n);
        System.out.println(sum);
        number.close();
    }
}
