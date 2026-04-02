public class Task3 {
    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) {
        return (b == 0) ? 0 : a / b;
    }

    public static void main(String[] args) {
        System.out.println("Сложение: " + add(10, 5));
    }
}