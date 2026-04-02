import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        System.out.print("Выберите операцию (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        if (op == '+') System.out.println("Результат: " + (num1 + num2));
        else if (op == '-') System.out.println("Результат: " + (num1 - num2));
        else if (op == '*') System.out.println("Результат: " + (num1 * num2));
        else if (op == '/') {
            if (num2 != 0) System.out.println("Результат: " + (num1 / num2));
            else System.out.println("Ошибка: деление на ноль.");
        }
    }
}