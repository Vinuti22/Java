public class OddNumbers {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Нечётные числа от 1 до 100:");
        do {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 100);
    }
}