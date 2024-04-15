import java.util.Scanner;
public class JP109 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(x<0 || x>100){
            System.out.println("error");
        }else if(x>=60 && x%2==0){
            System.out.println("pass");
            System.out.println("even");
        }else if(x>=60 && x%2==1){
            System.out.println("pass");
            System.out.println("odd");
        }else if(x<60 && x%2==0){
            System.out.println("fail");
            System.out.println("even");
        }else if(x<60 && x%2==1){
            System.out.println("fail");
            System.out.println("odd");
        }
        scanner.close();
    }
}
