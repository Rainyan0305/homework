import java.util.*;
public class JPA404 {
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        int fs[] = new int[10];
        fs[0] =0;fs[1] =1;
        for(int i=2; i<10; i++){
            fs[i]=fs[i-2]+fs[i-1];
        }
        for (int i=0 ; i<10; i++){
            System.out.println(fs[i]);
        }
    } 
}
