package geekbrains1_lesson1;

import java.util.Scanner;

public class true_if_negative {
//6. Написать метод, которому в качестве параметра передается целое число,
// метод должен вернуть true, если число отрицательное;
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean b;

        if (a < 0) {
            b = true;
        } else {
            b = false;
        }
        System.out.println(b);
    }

}
