import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;
        System.out.println("Введите числа (для завершения введите 0):");
        do {
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);
        System.out.println("Сумма введённых чисел: " + sum);
    }
}