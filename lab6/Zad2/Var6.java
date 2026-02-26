import java.util.Scanner;

public class Var6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вариант 6. Введите x: ");
        double x = scanner.nextDouble();
        double f;

        if (x >= 2.5) {
            f = 3 * Math.pow(x, 3) + 5;
        } else if (x >= 1.5 && x < 2.5) {
            f = x * Math.sin(x);
        } else {
            f = x * Math.tan(x) - Math.sin(x);
        }
        System.out.println("Результат: f(x) = " + f);
        scanner.close();
    }
}