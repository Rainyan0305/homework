import java.util.Scanner;
public class JP302 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        while (true) {
            int i = number.nextInt();
            int total = compute(i);
            System.out.println(total);
        }
    }
    public static int compute(int x){
        if (x <= 0 || x>=100){
        return -1;
        }else if (x >= 60){ 
        return x+5;
        }else {
        return x+10;
        }
    }    
}
