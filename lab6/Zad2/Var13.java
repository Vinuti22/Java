import java.util.Scanner;

public class Var13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вариант 13. Введите x: ");
        double x = scanner.nextDouble();
        double f;

        if (x >= 3 && x <= 5) {
            f = Math.exp(Math.pow(x, 3)) + 2 * x;
            System.out.println("Результат: f(x) = " + f);
        } else if (x >= 1 && x < 3) {
            f = Math.sin(5 * x) * (1 - x * Math.log(x));
            System.out.println("Результат: f(x) = " + f);
        } else {
            System.out.println("Вне области определения.");
        }
        scanner.close();
    }
}