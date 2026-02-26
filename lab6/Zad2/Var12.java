import java.util.Scanner;

public class Var12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вариант 12. Введите x: ");
        double x = scanner.nextDouble();
        double f;

        if (x >= 2 && x <= 6) {
            f = Math.cos(x) + Math.tan(x);
            System.out.println("Результат: f(x) = " + f);
        } else if (x > 0 && x < 2) {
            f = 1.7 * Math.pow(x, 3) + Math.sin(x);
            System.out.println("Результат: f(x) = " + f);
        } else {
            System.out.println("Вне области определения.");
        }
        scanner.close();
    }
}