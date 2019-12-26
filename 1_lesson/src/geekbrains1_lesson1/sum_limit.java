package geekbrains1_lesson1;

import java.util.Scanner;

public class sum_limit {
//Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в
// пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите первое число:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        boolean c;
        if ((a + b) >= 10 & (a + b) <= 20) {
            c = true;
        } else {
            c = false;
        }
        System.out.println(c);
    }
}
