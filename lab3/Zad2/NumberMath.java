import java.util.Scanner;

public class NumberMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число x: ");
        double x = sc.nextDouble();
        System.out.print("Введите число y: ");
        double y = sc.nextDouble();

        // 1. Сумма и среднее
        double sum = x + y;
        double avg = sum / 2;
        // 6. Квадрат и куб
        double square = x * x;
        double cube = x * x * x;

        System.out.println("Сумма: " + sum + ", Среднее: " + avg);
        System.out.println("Квадрат x: " + square + ", Куб x: " + cube);
    }
}