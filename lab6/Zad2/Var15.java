import java.util.Scanner;

public class Var15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вариант 15. Введите x: ");
        double x = scanner.nextDouble();
        double f;

        if (x > 3 && x <= 7) {
            f = 1.5 * Math.pow(x, 3) + Math.exp(Math.log(x));
            System.out.println("Результат: f(x) = " + f);
        } else if (x > 1 && x <= 3) {
            f = Math.pow(x, 4) * Math.sin(x) + Math.log(x);
            System.out.println("Результат: f(x) = " + f);
        } else {
            System.out.println("Вне области определения.");
        }
        scanner.close();
    }
}