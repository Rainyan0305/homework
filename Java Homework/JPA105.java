import java.util.Scanner;
public class JPA105 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in,"UTF-8");
        System.out.print("請輸入您的姓名:");
        String name =s.nextLine();
        System.out.println("Hi."+name+",請輸入您的銅板的個數:");
        System.out.printf("請輸入1元的數量: " );
        int b = s.nextInt();
        System.out.printf("請輸入5元的數量: ");
        int c = s.nextInt();
        System.out.printf("請輸入10元的數量: ");
        int d = s.nextInt();
        System.out.printf("請輸入50元的數量: ");
        int e = s.nextInt();
        double total = e*50+d*10+c*5+b*1;
        int thousand = (int) Math.floor(total / 1000);
        int hundred = (int) Math.floor((total % 1000) / 100);
        int ten = (int) Math.floor((total % 100) / 10);
        int number = (int) (total % 10);
        System.out.printf("你的錢總共有: %d千 %d 百 %d 十 %d 元", thousand,hundred,ten,number);
        s.close();


    }
}
