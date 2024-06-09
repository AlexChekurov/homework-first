import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
//        3. Вывести true если в числе нет цифр дубликатов
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        int digitFlag = 0;  // Переменная для хранения информации о встреченных цифрах
        boolean hasDuplicates = false;

        while (number != 0) {
            int digit = number % 10;  // Получаем последнюю цифру числа
            int mask = 1 << digit;  // Создаем маску для текущей цифры

            if ((digitFlag & mask) != 0) {
                hasDuplicates = true;  // Если цифра уже встречалась, установим флаг дубликата
                break;  // Выход из цикла, так как дубликат найден
            }

            digitFlag |= mask;  // Отметим цифру как встреченную
            number /= 10;  // Убираем последнюю цифру из числа
        }

        // Выводим true, если дубликатов нет, иначе false
        System.out.println("Все цифры уникальны: " + !hasDuplicates);
    }
}
