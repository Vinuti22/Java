import java.util.Scanner;

public class Var2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вариант 2. Введите x: ");
        double x = scanner.nextDouble();
        double f;

        if (x >= 0) {
            f = Math.pow(x, 3) + 5;
            System.out.println("Результат: f(x) = " + f);
        } else if (x > -3 && x < 0) {
            f = 3 * Math.pow(x, 4) + 9;
            System.out.println("Результат: f(x) = " + f);
        } else {
            System.out.println("Вне области определения.");
        }
        scanner.close();
    }
}