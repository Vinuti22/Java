import java.util.Scanner;

public class Var14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вариант 14. Введите x: ");
        double x = scanner.nextDouble();
        double f;

        if (x > 1 && x <= 4) {
            f = Math.tan(3 * x) + Math.log(5 * x);
            System.out.println("Результат: f(x) = " + f);
        } else if (x > -1 && x <= 1) {
            f = Math.pow(x, 2) - Math.pow(x, 3);
            System.out.println("Результат: f(x) = " + f);
        } else {
            System.out.println("Вне области определения.");
        }
        scanner.close();
    }
}