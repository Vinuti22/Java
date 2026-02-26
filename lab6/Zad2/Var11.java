import java.util.Scanner;

public class Var11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вариант 11. Введите x: ");
        double x = scanner.nextDouble();
        double f;

        if (x > 4) {
            f = Math.log(x) + 3 * Math.pow(x, 5) - 7;
            System.out.println("Результат: f(x) = " + f);
        } else if (x > 0 && x <= 4) {
            f = Math.sin(x) + Math.pow(x, 2) - 6;
            System.out.println("Результат: f(x) = " + f);
        } else {
            System.out.println("Вне области определения (x должен быть > 0).");
        }
        scanner.close();
    }
}