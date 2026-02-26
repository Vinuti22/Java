import java.util.Scanner;

public class Var7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вариант 7. Введите x: ");
        double x = scanner.nextDouble();
        double f;

        if (x >= 1) {
            f = 5 * Math.sin(x) - 9;
            System.out.println("Результат: f(x) = " + f);
        } else if (x > 0 && x < 1) {
            f = 3 * Math.pow(x, 2) + 4 * Math.cos(x);
            System.out.println("Результат: f(x) = " + f);
        } else {
            System.out.println("Вне области определения.");
        }
        scanner.close();
    }
}