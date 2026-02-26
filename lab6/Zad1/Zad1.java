package lab6.Zad1;

import java.util.Scanner;

public class Zad1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Задание 1: Площадь прямоугольника ---
        System.out.println("--- Задание 1 ---");
        System.out.print("Введите ширину прямоугольника: ");
        double w = scanner.nextDouble();
        System.out.print("Введите высоту прямоугольника: ");
        double h = scanner.nextDouble();
        System.out.println("Площадь: " + rectangleArea(w, h));

        // --- Задание 2: Чётность числа ---
        System.out.println("\n--- Задание 2 ---");
        System.out.print("Введите целое число для проверки на чётность: ");
        int num = scanner.nextInt();
        String parity = isEven(num) ? "чётное" : "нечётное";
        System.out.println("Число " + num + " — " + parity);

        // --- Задание 3: Перегрузка метода (Max) ---
        System.out.println("\n--- Задание 3 ---");
        System.out.println("Максимум из 10 и 20 (int): " + max(10, 20));
        System.out.println("Максимум из 15.5 и 10.2 (double): " + max(15.5, 10.2));

        // --- Задание 4: Рекурсивный факториал ---
        System.out.println("\n--- Задание 4 ---");
        System.out.print("Введите число для вычисления факториала: ");
        int fNum = scanner.nextInt();
        long fResult = factorial(fNum);
        if (fResult != -1) {
            System.out.println("Факториал " + fNum + "! = " + fResult);
        }

        // --- Задание 5: Рекурсивная степень ---
        System.out.println("\n--- Задание 5 ---");
        System.out.print("Введите основание степени (base): ");
        int base = scanner.nextInt();
        System.out.print("Введите показатель степени (exponent): ");
        int exp = scanner.nextInt();
        if (exp < 0) {
            System.out.println("Ошибка: показатель степени должен быть >= 0");
        } else {
            System.out.println(base + " в степени " + exp + " = " + power(base, exp));
        }
    }

    // --- Методы для заданий ---

    /**
     * Задание 1: Вычисление площади
     */
    public static double rectangleArea(double width, double height) {
        return width * height;
    }

    /**
     * Задание 2: Проверка на чётность
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Задание 3: Перегрузка метода max для int
     */
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    /**
     * Задание 3: Перегрузка метода max для double
     */
    public static double max(double a, double b) {
        return (a > b) ? a : b;
    }

    /**
     * Задание 4: Рекурсивный факториал
     */
    public static long factorial(int n) {
        if (n < 0) {
            System.out.println("Ошибка: число отрицательное!");
            return -1;
        }
        if (n == 0 || n == 1) return 1; // Базовый случай
        return n * factorial(n - 1);    // Рекурсивный шаг
    }

    /**
     * Задание 5: Рекурсивное возведение в степень
     */
    public static long power(int base, int exponent) {
        if (exponent == 0) return 1;   // Базовый случай (любое число в степени 0 = 1)
        return base * power(base, exponent - 1); // Рекурсивный шаг
    }
}