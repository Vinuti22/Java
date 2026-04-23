import javax.swing.*;
import java.util.Random;

public class main {

    public static void main(String[] args) {
        while (true) {
            String[] options = {
                    "1-8: Примеры из текста",
                    "9-18: Дополнительные задачи",
                    "Выход"
            };

            int choice = JOptionPane.showOptionDialog(null,
                    "Выберите категорию задач Лабораторной работы №14:",
                    "Меню Лабораторной №14",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null, options, options[0]);

            if (choice == 0) mainMenuPart1();
            else if (choice == 1) mainMenuPart2();
            else break;
        }
    }

    // --- МЕНЮ 1 (Примеры из текста) ---
    private static void mainMenuPart1() {
        String input = JOptionPane.showInputDialog(
                "Выберите номер задачи (1-8):\n" +
                        "1. Числа от 1 до 10\n" +
                        "2. Ввод положительного числа\n" +
                        "3. Сумма цифр\n" +
                        "4. Проверка пароля (12345)\n" +
                        "5. Факториал\n" +
                        "6. Продолжить/Стоп\n" +
                        "7. Сумма двух чисел (цикл)\n" +
                        "8. Сумма четных до 100"
        );
        if (input == null) return;

        switch (input) {
            case "1" -> task1();
            case "2" -> task2();
            case "3" -> task3();
            case "4" -> task4();
            case "5" -> task5();
            case "6" -> task6();
            case "7" -> task7();
            case "8" -> task8();
            default -> JOptionPane.showMessageDialog(null, "Неверный ввод");
        }
    }

    // --- МЕНЮ 2 (Новые задачи) ---
    private static void mainMenuPart2() {
        String input = JOptionPane.showInputDialog(
                "Выберите доп. задачу (1-10):\n" +
                        "1. Сумма от 1 до N\n" +
                        "2. Кол-во цифр\n" +
                        "3. Таблица умножения\n" +
                        "4. Наибольшая цифра\n" +
                        "5. Палиндром\n" +
                        "6. Кол-во четных цифр\n" +
                        "7. Рандом до 0\n" +
                        "8. Сумма до ввода 0\n" +
                        "9. Пароль (>6 символов)\n" +
                        "10. Минимальное из введенных"
        );
        if (input == null) return;

        switch (input) {
            case "1" -> extra1();
            case "2" -> extra2();
            case "3" -> extra3();
            case "4" -> extra4();
            case "5" -> extra5();
            case "6" -> extra6();
            case "7" -> extra7();
            case "8" -> extra8();
            case "9" -> extra9();
            case "10" -> extra10();
            default -> JOptionPane.showMessageDialog(null, "Неверный ввод");
        }
    }

    // ========== МЕТОДЫ ЗАДАЧ (ПРИМЕРЫ) ==========

    static void task1() {
        StringBuilder result = new StringBuilder();
        int i = 1;
        do { result.append(i).append(" "); i++; } while (i <= 10);
        JOptionPane.showMessageDialog(null, "Числа: " + result);
    }

    static void task2() {
        int n;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Введите положительное число:"));
        } while (n <= 0);
        JOptionPane.showMessageDialog(null, "Вы ввели: " + n);
    }

    static void task3() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Введите число:"));
        int sum = 0, temp = Math.abs(n);
        do { sum += temp % 10; temp /= 10; } while (temp > 0);
        JOptionPane.showMessageDialog(null, "Сумма цифр: " + sum);
    }

    static void task4() {
        String pass = "12345", input;
        do { input = JOptionPane.showInputDialog("Введите пароль:");
        } while (!pass.equals(input));
        JOptionPane.showMessageDialog(null, "Доступ разрешен!");
    }

    static void task5() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Факториал числа:"));
        long fact = 1; int i = 1;
        if (n > 0) { do { fact *= i; i++; } while (i <= n); }
        JOptionPane.showMessageDialog(null, "Результат: " + fact);
    }

    static void task6() {
        String choice;
        do { choice = JOptionPane.showInputDialog("Работаем? (yes/no)");
        } while (choice != null && choice.equalsIgnoreCase("yes"));
    }

    static void task7() {
        String choice;
        do {
            int a = Integer.parseInt(JOptionPane.showInputDialog("Число A:"));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Число B:"));
            JOptionPane.showMessageDialog(null, "Сумма: " + (a + b));
            choice = JOptionPane.showInputDialog("Еще раз? (yes/no)");
        } while (choice != null && choice.equalsIgnoreCase("yes"));
    }

    static void task8() {
        int sum = 0, i = 2;
        do { sum += i; i += 2; } while (i <= 100);
        JOptionPane.showMessageDialog(null, "Сумма четных до 100: " + sum);
    }

    // ========== ДОПОЛНИТЕЛЬНЫЕ 10 ЗАДАЧ ==========

    static void extra1() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Введите N:"));
        int sum = 0, i = 1;
        do { sum += i; i++; } while (i <= n);
        JOptionPane.showMessageDialog(null, "Сумма от 1 до " + n + ": " + sum);
    }

    static void extra2() {
        int n = Math.abs(Integer.parseInt(JOptionPane.showInputDialog("Введите число:")));
        int count = 0;
        do { n /= 10; count++; } while (n > 0);
        JOptionPane.showMessageDialog(null, "Количество цифр: " + count);
    }

    static void extra3() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Таблица умножения для:"));
        StringBuilder sb = new StringBuilder();
        int i = 1;
        do { sb.append(n).append(" x ").append(i).append(" = ").append(n * i).append("\n"); i++;
        } while (i <= 10);
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    static void extra4() {
        int n = Math.abs(Integer.parseInt(JOptionPane.showInputDialog("Введите число:")));
        int max = 0;
        do {
            int digit = n % 10;
            if (digit > max) max = digit;
            n /= 10;
        } while (n > 0);
        JOptionPane.showMessageDialog(null, "Наибольшая цифра: " + max);
    }

    static void extra5() {
        String s = JOptionPane.showInputDialog("Введите число:");
        int i = 0, j = s.length() - 1;
        boolean isPal = true;
        do {
            if (s.charAt(i) != s.charAt(j)) { isPal = false; break; }
            i++; j--;
        } while (i < j);
        JOptionPane.showMessageDialog(null, "Палиндром: " + isPal);
    }

    static void extra6() {
        int n = Math.abs(Integer.parseInt(JOptionPane.showInputDialog("Введите число:")));
        int count = 0;
        do {
            if ((n % 10) % 2 == 0) count++;
            n /= 10;
        } while (n > 0);
        JOptionPane.showMessageDialog(null, "Четных цифр: " + count);
    }

    static void extra7() {
        Random r = new Random();
        int num;
        StringBuilder sb = new StringBuilder("Числа: ");
        do {
            num = r.nextInt(10); // от 0 до 9
            sb.append(num).append(" ");
        } while (num != 0);
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    static void extra8() {
        int sum = 0, num;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Вводите числа (0 для стопа):"));
            sum += num;
        } while (num != 0);
        JOptionPane.showMessageDialog(null, "Общая сумма: " + sum);
    }

    static void extra9() {
        String pass;
        do {
            pass = JOptionPane.showInputDialog("Придумайте пароль (мин. 6 символов):");
        } while (pass == null || pass.length() < 6);
        JOptionPane.showMessageDialog(null, "Пароль принят!");
    }

    static void extra10() {
        int min = Integer.MAX_VALUE, num;
        String input;
        do {
            input = JOptionPane.showInputDialog("Вводите числа (стоп для выхода):");
            if (input != null && !input.equalsIgnoreCase("стоп")) {
                num = Integer.parseInt(input);
                if (num < min) min = num;
            }
        } while (input != null && !input.equalsIgnoreCase("стоп"));
        JOptionPane.showMessageDialog(null, "Минимальное число: " + (min == Integer.MAX_VALUE ? "не введено" : min));
    }
}