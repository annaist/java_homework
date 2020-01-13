package geekbrains1_lesson1;

import java.util.Scanner;

public class positive_or_negative {
    //5. Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль положительное ли число передали, или отрицательное;
    // Замечание: ноль считаем положительным числом.

    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }

    }

}
