public class JPA405 {
    public static void main(String[] args) {
        String letter [] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};   
        System.out.print("反轉陣列資料之前 : ");
        for (int i = 0; i < letter.length; i++) {
            System.out.print(letter[i] + " ");
        }
        System.out.print("\n反轉陣列資料之後 : ");
        for (int i = letter.length - 1; i >= 0; i--) {
            System.out.print(letter[i] + " ");
        }
    }
}
