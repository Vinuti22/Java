import java.util.Scanner;

public class Var10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вариант 10. Введите x: ");
        double x = scanner.nextDouble();
        double f;

        if (x >= 2 && x <= 6) {
            f = Math.tan(x) + Math.cos(x) - 3.5;
            System.out.println("Результат: f(x) = " + f);
        } else if (x > 0) {
            f = Math.pow(x, 2) + Math.sin(x) + 1.2;
            System.out.println("Результат: f(x) = " + f);
        } else {
            System.out.println("Вне области определения.");
        }
        scanner.close();
    }
}