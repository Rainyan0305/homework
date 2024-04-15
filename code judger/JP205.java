import java.util.Scanner;
public class JP205 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] start = new int[10];
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int totalerrors = 0;
        for(int i = 0; i < 10; i++){
            start[i] = scanner.nextInt();
            if(start[i] == 1){
                a +=1;
            }else if(start[i] == 2){
                b +=1;
            }else if(start[i] == 3){
                c +=1;
            }else if(start[i] == 4){
                d +=1;
            }else if(start[i] == 5){
                e +=1;
            }else if(start[i] == 6){
                f +=1;
            }else{
                totalerrors += 1;
            }
        }
        System.out.println("number1:"+a);
        System.out.println("number2:"+b);
        System.out.println("number3:"+c);
        System.out.println("number4:"+d);
        System.out.println("number5:"+e);
        System.out.println("number6:"+f);
        System.out.println("error:"+totalerrors);
        scanner.close();
    }
    
}
