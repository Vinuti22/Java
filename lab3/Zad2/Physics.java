import java.util.Scanner;

public class Physics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Температура (F = C * 1.8 + 32)
        System.out.print("Градусы Цельсия: ");
        double c = sc.nextDouble();
        double f = (c * 1.8) + 32;
        System.out.println("Фаренгейт: " + f);

        // Расстояние (S = v * t)
        System.out.print("Скорость v: ");
        double v = sc.nextDouble();
        System.out.print("Время t: ");
        double t = sc.nextDouble();
        System.out.println("Расстояние S: " + (v * t));
    }
}