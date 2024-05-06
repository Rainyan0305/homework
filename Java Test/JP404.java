import java.util.Scanner;

public class JP404 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 提示用戶輸入字符串
        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); // 讀取用戶輸入的字符串

        // 找到最常見的字符以及其出現的頻率
        char mostFrequentChar = findMostFrequentCharacter(input);
        int frequency = countFrequency(input, mostFrequentChar);

        // 輸出最常見的字符和其出現的頻率
        System.out.println("Most frequent character: " + mostFrequentChar);
        System.out.println("Frequency: " + frequency);

        scanner.close();
    }

    // 找到字符串中出現頻率最高的字符
    public static char findMostFrequentCharacter(String str) {
        int[] charCount = new int[26]; // 26個小寫字母的出現次數計數
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) { // 只處理小寫字母
                charCount[c - 'a']++; // 將該字符對應的計數加1
            }
        }

        int maxCount = 0;
        char mostFrequentChar = 'a'; // 預設最常見的字符為 'a'

        // 遍歷計數數組，找到出現頻率最高的字符
        for (int i = 0; i < 26; i++) {
            if (charCount[i] > maxCount) {
                maxCount = charCount[i];
                mostFrequentChar = (char) ('a' + i); // 更新最常見的字符
            }
        }

        return mostFrequentChar;
    }

    // 計算指定字符在字符串中出現的次數
    public static int countFrequency(String str, char target) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == target) {
                count++; // 若字符與目標字符相同，則計數加1
            }
        }
        return count; // 返回字符出現的次數
    }
}
