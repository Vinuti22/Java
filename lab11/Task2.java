import java.util.Scanner;

public class Task2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continueChoice = "yes";

        while (!continueChoice.equalsIgnoreCase("no")) {
            System.out.print("Введите число: ");
            double n1 = sc.nextDouble();
            System.out.println("Вы ввели: " + n1);

            System.out.print("Продолжить? (yes/no): ");
            continueChoice = sc.next();
        }
    }
}