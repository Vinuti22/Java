import java.util.Scanner;

public class Var8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вариант 8. Введите x: ");
        double x = scanner.nextDouble();
        double f;

        if (x >= 0 && x < 2) {
            f = 5 * x * Math.cos(x);
            System.out.println("Результат: f(x) = " + f);
        } else if (x >= 2 && x < 5) {
            f = Math.pow(x, 3) - 2 * x;
            System.out.println("Результат: f(x) = " + f);
        } else {
            System.out.println("Вне области определения.");
        }
        scanner.close();
    }
}