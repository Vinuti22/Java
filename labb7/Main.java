import java.util.Random;

public class Main {

    static Random random = new Random();

    // 1. Сумма отрицательных A[20]
    static void task1() {
        int[] A = new int[20];
        int sum = 0;

        System.out.print("A: ");
        for (int i = 0; i < 20; i++) {
            A[i] = random.nextInt(50) - 25;
            System.out.print(A[i] + " ");

            if (A[i] < 0) sum += A[i];
        }

        System.out.println("\nСумма отрицательных = " + sum);
    }

    // 2. Сумма положительных B[15]
    static void task2() {
        int[] B = new int[15];
        int sum = 0;

        for (int i = 0; i < 15; i++) {
            B[i] = random.nextInt(50) - 25;
            if (B[i] > 0) sum += B[i];
        }

        System.out.println("Сумма положительных = " + sum);
    }

    // 3. Произведение отрицательных A[12]
    static void task3() {
        double[] A = new double[12];
        double prod = 1;

        for (int i = 0; i < 12; i++) {
            A[i] = random.nextDouble() * 50 - 25;
            if (A[i] < 0) prod *= A[i];
        }

        System.out.println("Произведение отрицательных = " + prod);
    }

    // 4. Произведение положительных C[25]
    static void task4() {
        int[] C = new int[25];
        int prod = 1;

        for (int i = 0; i < 25; i++) {
            C[i] = random.nextInt(50) - 25;
            if (C[i] > 0) prod *= C[i];
        }

        System.out.println("Произведение положительных = " + prod);
    }

    // 5. Среднее D[17]
    static void task5() {
        int[] D = new int[17];
        int sum = 0;

        for (int i = 0; i < 17; i++) {
            D[i] = random.nextInt(50);
            sum += D[i];
        }

        System.out.println("Среднее = " + (sum / 17.0));
    }

    // 6. Сумма отрицательных по строкам A[10][10]
    static void task6() {
        int[][] A = new int[10][10];

        for (int i = 0; i < 10; i++) {
            int sum = 0;

            for (int j = 0; j < 10; j++) {
                A[i][j] = random.nextInt(50) - 25;
                if (A[i][j] < 0) sum += A[i][j];
            }

            System.out.println("Строка " + i + " сумма отрицательных = " + sum);
        }
    }

    // 7. Сумма положительных B[5][5]
    static void task7() {
        int[][] B = new int[5][5];

        for (int i = 0; i < 5; i++) {
            int sum = 0;

            for (int j = 0; j < 5; j++) {
                B[i][j] = random.nextInt(50) - 25;
                if (B[i][j] > 0) sum += B[i][j];
            }

            System.out.println("Строка " + i + " сумма положительных = " + sum);
        }
    }

    // 8. Произведение отрицательных по столбцам A[12][6]
    static void task8() {
        double[][] A = new double[12][6];

        for (int j = 0; j < 6; j++) {
            double prod = 1;

            for (int i = 0; i < 12; i++) {
                A[i][j] = random.nextDouble() * 50 - 25;
                if (A[i][j] < 0) prod *= A[i][j];
            }

            System.out.println("Столбец " + j + " произведение отрицательных = " + prod);
        }
    }

    // 9. Произведение положительных главной диагонали C[5][5]
    static void task9() {
        double[][] C = new double[5][5];
        double prod = 1;

        for (int i = 0; i < 5; i++) {
            C[i][i] = random.nextDouble() * 20;

            if (C[i][i] > 0) prod *= C[i][i];
        }

        System.out.println("Произведение диагонали = " + prod);
    }

    // 10. Среднее диагонали D[7][7]
    static void task10() {
        double[][] D = new double[7][7];
        double sum = 0;

        for (int i = 0; i < 7; i++) {
            D[i][i] = random.nextDouble() * 20;
            sum += D[i][i];
        }

        System.out.println("Среднее диагонали = " + sum / 7);
    }

    // 11. Swap max and min
    static void task11() {
        int n = 25;
        int[] A = new int[n];

        for (int i = 0; i < n; i++)
            A[i] = random.nextInt(50);

        int maxIndex = 0, minIndex = 0;

        for (int i = 1; i < n; i++) {
            if (A[i] > A[maxIndex]) maxIndex = i;
            if (A[i] < A[minIndex]) minIndex = i;
        }

        int temp = A[maxIndex];
        A[maxIndex] = A[minIndex];
        A[minIndex] = temp;

        System.out.println("После обмена:");
        for (int x : A) System.out.print(x + " ");
        System.out.println();
    }

    // 12. Сортировка
    static void task12() {
        int[] B = new int[25];

        for (int i = 0; i < 25; i++)
            B[i] = random.nextInt(50);

        java.util.Arrays.sort(B);

        for (int x : B) System.out.print(x + " ");
        System.out.println();
    }

    // 13. Среднее C[20]
    static void task13() {
        int[] C = new int[20];
        int sum = 0;

        for (int i = 0; i < 20; i++) {
            C[i] = random.nextInt(50);
            sum += C[i];
        }

        System.out.println("Среднее = " + sum / 20.0);
    }

    // 14. Чётные и нечётные D[30]
    static void task14() {
        int[] D = new int[30];

        int even = 0, odd = 0;

        for (int i = 0; i < 30; i++) {
            D[i] = random.nextInt(50);

            if (D[i] % 2 == 0) even += D[i];
            else odd += D[i];
        }

        System.out.println("Сумма чётных = " + even);
        System.out.println("Сумма нечётных = " + odd);
    }

    // 15. Таблица 3x5
    static void task15() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(random.nextInt(10) + " ");
            }
            System.out.println();
        }
    }

    // 16. MaxX
    static void task16() {
        int[] A = new int[10];

        for (int i = 0; i < 10; i++)
            A[i] = random.nextInt(50);

        int max = A[0];

        for (int x : A)
            if (x > max) max = x;

        System.out.println("Максимальный элемент = " + max);
    }

    // 17. String condition
    static void task17() {
        String s1 = "Hello ";
        String s2 = "Java";
        String s3 = "World";
        String s4 = "Test";
        String s5 = "Test";

        String result;

        if (s4.equals(s5))
            result = s1 + s2;
        else
            result = s1 + s3;

        System.out.println(result);
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
    }
}