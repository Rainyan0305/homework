import java.util.Scanner;
public class JPA504 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.printf("Input the number :");
        int a = number.nextInt();
        int total = sum2(a);
        System.out.printf("Ans:"+(total)); 
        number.close();
    }
    public static int sum2(int m) {
        if(m == 1){
        return 2;
        }else{
            int sum = 0;
            sum+=sum2(m-1)+2*m;
            return sum;
        }
    }
}