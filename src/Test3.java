import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {

        // Как определить количество слов в строке
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слова одной строкой через пробел");
        String input = scanner.nextLine();

        int count = 0;
        if (input.length() != 0) {
            count++;

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    count++;
                }
            }
            System.out.println("Вы ввели " + count + " слов");
        }
    }
}