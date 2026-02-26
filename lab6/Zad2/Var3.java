import java.util.Scanner;

public class Var3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вариант 3. Введите x: ");
        double x = scanner.nextDouble();
        double f;

        if (x > 0) {
            f = Math.pow(x, 5) + 3.5;
            System.out.println("Результат: f(x) = " + f);
        } else if (x >= -4 && x <= 5) {
            f = 3 * Math.pow(x, 2) - 6 * x + 4;
            System.out.println("Результат: f(x) = " + f);
        } else {
            System.out.println("Вне области определения.");
        }
        scanner.close();
    }
}