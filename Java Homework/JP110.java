import java.util.Scanner;
public class JP110 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("");
        int a = number.nextInt();
        int b = number.nextInt();
        int c = number.nextInt();
        if(60 <= a && a < 100){
            System.out.println("1");
        }
        else{
        System.out.println("0");
        }
        double total = ((b+1)/10.0);
        System.out.printf("%.2f\n", total);
        if(a>=c){
            System.out.println(a);
        }else{
            System.out.println(c);
        }
    number.close();
    }
}

