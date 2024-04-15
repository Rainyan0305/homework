import java.util.Scanner;
public class JPMaxValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] array = new int[5];
        for(int i = 0; i < array.length; i++){
            array[i] = s.nextInt();
        } 
        int maxValue = compute(array);
        System.out.println(maxValue);
        s.close();
    }

    public static int compute(int[] array) {
        int max = array[0]; 
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) { 
                max = array[i]; 
            }
        }
        return max; 
    }
}
