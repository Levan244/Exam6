import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    //    Напишите пример перехвата и обработки исключения в блоке try-catch-метода.
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число:");
        String input = reader.readLine();
        try {
            int number = Integer.parseInt(input);
            if (number < 0) {
                throw new Exception("Число должно быть положительным");
            }
            System.out.printf("Квадрат числа: %d", number * number);
        } catch (Exception e) {
            System.out.printf("Ошибка: %s%n", e.getMessage());
        }
        System.out.println();
    }

}

