import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Прямоугольник
        System.out.print("Длина a: ");
        double a = sc.nextDouble();
        System.out.print("Ширина b: ");
        double b = sc.nextDouble();
        System.out.println("S прямоугольника: " + (a * b));
        System.out.println("P прямоугольника: " + (2 * (a + b)));

        // Круг (S = PI * r^2)
        System.out.print("Введите радиус r: ");
        double r = sc.nextDouble();
        double circleS = Math.PI * r * r;
        System.out.println("S круга: " + circleS);
    }
}