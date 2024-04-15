import java.util.Scanner;
public class JP110 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = s.nextInt();
        }
        if(numbers[0]>=60 && numbers[0]<100){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
        System.out.printf("%.2f\n",((numbers[1]+1.0)/10));
        
        if (numbers[0]>=numbers[2]){
            System.out.println(numbers[0]);
        }else if(numbers[0]<=numbers[2]){
            System.out.println(numbers[2]);
        }
        s.close();
    }
}
