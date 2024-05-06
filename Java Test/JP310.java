import java.util.Scanner;
public class JP310 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        int n = scanner.nextInt();
        // 呼叫 compute() 函式並輸出結果
         // 假設 n 為 1000
        int sumOfArmstrong = compute(n);
        
        System.out.println("所有小於" + n + "的阿姆斯壯數與其總和為：" + sumOfArmstrong);
        scanner.close();
    }

    // 定義 compute() 函式
    public static int compute(int n) {
        int sum = 0; // 初始化總和為 0
        for (int i = 0; i < n; i++) { // 迴圈從 0 開始到 n-1
            if (isArmstrong(i)) { // 如果 i 是阿姆斯壯數
                System.out.print(i + "\n"); // 輸出阿姆斯壯數
                sum += i; // 將阿姆斯壯數加入總和中
            }
        }
        return sum; // 回傳總和
    }

    // 判斷一個數字是否為阿姆斯壯數的函式
    public static boolean isArmstrong(int num) {
        int originalNum = num; // 儲存原始數字
        int sum = 0; // 初始化總和為 0
        int numOfDigits = String.valueOf(num).length(); // 取得數字的位數
        while (num != 0) {
            int digit = num % 10; // 取得最後一位數字
            sum += Math.pow(digit, numOfDigits); // 加上該位數的次方
            num /= 10; // 去掉最後一位數字
        }
        return sum == originalNum; // 判斷總和是否等於原始數字
    }
}
