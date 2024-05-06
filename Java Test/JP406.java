import java.util.Scanner;

public class JP406 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 讀取輸入字串
        String input = scanner.nextLine();

        // 執行位移字元操作
        String output = shiftCharacters(input);
        System.out.println(output);

        scanner.close();
    }

    // 方法：將字串中的字元進行位移
    public static String shiftCharacters(String input) {
        StringBuilder result = new StringBuilder();
        String keyboard = "QWERTYUIOPASDFGHJKLZXCVBNM"; // 鍵盤字母排列

        // 遍歷輸入字串中的每個字元
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            // 對每個字元進行位移，並將結果附加到結果字串中
            char shiftedChar = shiftCharacter(currentChar, keyboard);
            result.append(shiftedChar);
        }

        return result.toString(); // 返回位移後的字串
    }

    // 方法：對單個字元進行位移
    public static char shiftCharacter(char ch, String keyboard) {
        // 如果字元不是字母，則不進行位移，直接返回原字元
        if (!Character.isLetter(ch)) {
            return ch;
        }

        // 如果字元是 'P', 'L', 'M' 中的任何一個，則不進行位移，直接返回原字元
        if (Character.toUpperCase(ch) == 'P' || Character.toUpperCase(ch) == 'L'
                || Character.toUpperCase(ch) == 'M') {
            return ch;
        }

        // 如果字元是小寫字母，則對其進行位移
        if (Character.isLowerCase(ch)) {
            int index = keyboard.indexOf(Character.toUpperCase(ch)); // 獲取字元在鍵盤字串中的索引
            int nextIndex = (index + 1) % keyboard.length(); // 下一個字元在鍵盤字串中的索引
            return Character.toLowerCase(keyboard.charAt(nextIndex)); // 返回下一個字元的小寫形式
        }

        // 如果字元是大寫字母，則對其進行位移
        if (Character.isUpperCase(ch)) {
            int index = keyboard.indexOf(ch); // 獲取字元在鍵盤字串中的索引
            int nextIndex = (index + 1) % keyboard.length(); // 下一個字元在鍵盤字串中的索引
            return keyboard.charAt(nextIndex); // 返回下一個字元
        }

        return ch; // 默認情況下，返回原字元
    }
}
