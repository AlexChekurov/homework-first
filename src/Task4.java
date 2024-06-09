import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
//        * 4. Вывести цифры которые идут в стр. порядке убывания пр. 432 при 23572348357
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        long number = scanner.nextLong();

        // Переменные для текущей и предыдущей цифр
        int previousDigit = -1;
        int currentDigit;

        // Переменная для хранения текущей последовательности убывающих цифр
        long currentSequence = 0;
        long multiplier = 1;

        while (number > 0) {
            currentDigit = (int) (number % 10);
            number /= 10;

            if (previousDigit != -1) {
                if (currentDigit > previousDigit) {
                    if (multiplier > 1) {
                        System.out.println("Последовательность убывающих цифр: " + currentSequence);
                    }
                    currentSequence = 0;
                    multiplier = 1;
                }
            }

            currentSequence += currentDigit * multiplier;
            multiplier *= 10;
            previousDigit = currentDigit;
        }

        if (multiplier > 10) {
            System.out.println("Последовательность убывающих цифр: " + currentSequence);
        }
    }
}
