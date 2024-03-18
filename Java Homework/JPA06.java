import java.util.Scanner;

public class JPA06 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
            for (int i = 0; i < 4; i++) {
                System.out.print("Input Chinese scores:");
                int chi = number.nextInt();

                System.out.print("Input English scores:");
                int eng = number.nextInt();

                System.out.print("Input Math scores:");
                int math = number.nextInt();
                if ((chi >= 60) & (eng >= 60) & (math >= 60)) {
                    System.out.printf("All Pass.");
                } else if((chi >= 60) & (eng >= 60) & (math < 60)){
                    System.out.printf("Math failed.\n");
                } else if((chi < 60) & (eng >= 60) & (math >= 60)){
                    System.out.printf("Chinese failed.\n"); 
                } else if((chi >= 60) & (eng < 60) & (math >= 60)){
                    System.out.printf("English failed.\n"); 
                }else if((chi < 60) & (eng < 60) & (math >= 60)){
                        System.out.printf("English failed.\n"); 
                }else if((chi >= 60) & (eng < 60) & (math < 60)){
                        System.out.printf("English failed.\n");
                }else if((chi < 60) & (eng >= 60) & (math < 60)){
                        System.out.printf("English failed.\n");
                } else {
                    System.out.printf("Chinese failed.\nEnglish failed.\nMath failed.\n"); 
                }
            }
            number.close();
        
    }
}
