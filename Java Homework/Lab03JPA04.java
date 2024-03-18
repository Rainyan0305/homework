import java.util.Scanner;
public class Lab03JPA04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total = 0;
        while (true) {
            System.out.print("Please enter meal dollars or enter -1 to stop:");
            int dollars = s.nextInt();
            if (dollars == -1) {
                System.out.printf("餐點總費用:%.1f\n",(double)total);
                break;
            }
            total += dollars;
        }
        s.close();
        double totals =Math.round((total/5.0)*100.0)/100.0;
        System.out.printf("5道餐點平均費用為:%.2f",totals);
    }
}