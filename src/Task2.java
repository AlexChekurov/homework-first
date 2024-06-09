import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
//        2. Вывести макс и мин цифры
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        // Инициализация переменных для максимальной и минимальной цифр
        int maxDigit = Integer.MIN_VALUE;
        int minDigit = Integer.MAX_VALUE;

        // Обработка каждого разряда числа
        while (number != 0) {
            int digit = number % 10;  // Получаем последнюю цифру числа
            if (digit > maxDigit) {
                maxDigit = digit;  // Обновляем максимальную цифру
            }
            if (digit < minDigit) {
                minDigit = digit;  // Обновляем минимальную цифру
            }
            number /= 10;  // Убираем последнюю цифру из числа
        }

        System.out.println("Максимальная цифра: " + maxDigit);
        System.out.println("Минимальная цифра: " + minDigit);
    }
}
