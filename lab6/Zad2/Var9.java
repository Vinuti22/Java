import java.util.Scanner;

public class Var9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вариант 9. Введите x: ");
        double x = scanner.nextDouble();
        double f;

        if (x > 2) {
            f = 1.7 * Math.pow(x, 3) - 7;
        } else if (x >= 1 && x <= 2) {
            f = Math.pow(x, 3) + 6 * Math.sin(x);
        } else if (x > 0 && x < 1) {
            f = Math.pow(x, 2) * Math.cos(x) + Math.sin(x);
        } else {
            System.out.println("Вне области определения.");
            return;
        }
        System.out.println("Результат: f(x) = " + f);
        scanner.close();
    }
}