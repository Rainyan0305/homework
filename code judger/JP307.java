import java.util.Scanner;
public class JP307 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] start = new int[5];
        for (int i = 0; i <5; i++) {
            start[i] = scanner.nextInt();
        }
        int max =start[0];
        for (int i = 0; i <5; i++) {
            if(start[i] > max){
                max = start[i];
            }
        }
        System.out.println(max); 
        scanner.close();   
      
    }
}
