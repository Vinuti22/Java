import java.util.Scanner;

public class Var5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вариант 5. Введите x: ");
        double x = scanner.nextDouble();
        double f;

        if (x >= 5 && x <= 9) {
            f = 5 * Math.pow(x, 2) + 1.6;
            System.out.println("Результат: f(x) = " + f);
        } else if (x >= 2) {
            f = 3 * Math.pow(x, 4) - 7;
            System.out.println("Результат: f(x) = " + f);
        } else if (x > 0 && x < 2) {
            f = x * Math.cos(x);
            System.out.println("Результат: f(x) = " + f);
        } else {
            System.out.println("Вне области определения.");
        }
        scanner.close();
    }
}