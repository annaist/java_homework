package geekbrains1_lesson1;

import java.util.Scanner;

public class name {

    public static void main(String[] args) {
        System.out.println("Введите имя:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println("Привет " + s + "!");

    }

}
