import java.util.Scanner;

public class Var1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод значения x
        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();
        double f;

        // Реализация условного оператора if-then-else [cite: 2, 6]
        if (x >= 0) {
            // f(x) = x^3 + 5, если x >= 0 
            f = Math.pow(x, 3) + 5;
            System.out.println("Результат (x >= 0): f(x) = " + f);
        } else if (x > -3 && x < 0) {
            // f(x) = 3x^4 + 9, если -3 < x < 0 
            f = 3 * Math.pow(x, 4) + 9;
            System.out.println("Результат (-3 < x < 0): f(x) = " + f);
        } else {
            System.out.println("Значение x не входит в область определения функции.");
        }

        scanner.close();
    }
}