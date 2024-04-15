import java.util.Scanner;
public class JP202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(x<0 || x>100){
            System.out.println("error");
        }else if(x >60){
            System.out.println(x+10);
        }else{
            System.out.println(x+5);
        }
        scanner.close();
    }
}
