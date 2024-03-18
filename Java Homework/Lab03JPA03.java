
public class Lab03JPA03 {
    public static void main(String[] args) {
        System.out.print("1~1000中的完美數有：");
        for (int i = 2; i <= 1000; i++) {
            if (isPerfectNumber(i)) {
                System.out.print(" "+i);
            }
        }
    }
    public static boolean isPerfectNumber(int num) {
        int sum = 1; 
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }
}

