import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//        1. Вывести число в обратном порядке
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;  // Получаем последнюю цифру числа
            reversedNumber = reversedNumber * 10 + digit;  // Формируем новое число в обратном порядке
            number /= 10;  // Убираем последнюю цифру из исходного числа
        }

        System.out.println("Число в обратном порядке: " + reversedNumber);
    }
}
