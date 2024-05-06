import java.util.Scanner;

public class JP508 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 輸入兩個二進位字串
        String myString1 = scanner.nextLine();         
        String myString2 = scanner.nextLine();          
        
        // 將字串轉換為十進位數字
        int n1 = binaryToDecimal(myString1);
        int n2 = binaryToDecimal(myString2);

        // 輸出相加結果
        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));  
        
        // 如果相加結果超過 255，則輸出 11111111
        if ((n1 + n2) > 255) {
            System.out.println("11111111");
        } else {
            System.out.println(Integer.toBinaryString(n1 + n2));
        }

        scanner.close();
    }

    // 將二進位字串轉換為十進位數字
    public static int binaryToDecimal(String binaryString) {
        int decimal = 0;
        int length = binaryString.length();
        for (int i = 0; i < length; i++) {
            int num = binaryString.charAt(i) - '0';
            decimal += num * Math.pow(2, (7 - i));
        }
        return decimal;
    }
}
