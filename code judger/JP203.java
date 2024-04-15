import java.util.Scanner;
public class JP203 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x != 1 && x != 2 && x != 3 && x != 4) {
            System.out.println("error");
        }else if (x==1){
            System.out.println("one");
        }else if (x==2){
            System.out.println("two");
        }else if (x==3){
            System.out.println("three");
        }else if (x==4){
            System.out.println("four");
        }
        scanner.close();
    }
}
