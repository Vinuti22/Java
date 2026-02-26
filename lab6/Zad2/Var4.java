import java.util.Scanner;

public class Var4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вариант 4. Введите x: ");
        double x = scanner.nextDouble();
        double f;

        if (x >= 1.22) {
            f = 5 * Math.pow(x, 3) + 1.7;
            System.out.println("Результат: f(x) = " + f);
        } else {
            f = x * Math.cos(x);
            System.out.println("Результат: f(x) = " + f);
        }
        scanner.close();
    }
}