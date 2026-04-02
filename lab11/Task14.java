import java.util.Stack;

public class Task14 {
    public static void main(String[] args) {
        // Пример выражения из задания
        String expression = "2 + 3 * 4";

        System.out.println("Выражение: " + expression);
        try {
            double result = evaluate(expression);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка в выражении");
        }
    }

    public static double evaluate(String expression) {
        char[] tokens = expression.toCharArray();

        // Стек для чисел
        Stack<Double> values = new Stack<>();
        // Стек для операторов
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            // Пропускаем пробелы
            if (tokens[i] == ' ') continue;

            // Если текущий символ - число, читаем его целиком
            if (tokens[i] >= '0' && tokens[i] <= '9') {
                StringBuilder sbuf = new StringBuilder();
                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9') {
                    sbuf.append(tokens[i++]);
                }
                values.push(Double.parseDouble(sbuf.toString()));
                i--; // Уменьшаем i, так как цикл добавит лишний шаг
            }
            // Если текущий символ - оператор
            else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/') {
                // Пока приоритет текущего оператора меньше или равен приоритету оператора в стеке
                while (!ops.empty() && hasPrecedence(tokens[i], ops.peek())) {
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                }
                ops.push(tokens[i]);
            }
        }

        // Выполняем оставшиеся операции
        while (!ops.empty()) {
            values.push(applyOp(ops.pop(), values.pop(), values.pop()));
        }

        return values.pop();
    }

    // Метод для проверки приоритета операций
    public static boolean hasPrecedence(char op1, char op2) {
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
            return false;
        } else {
            return true;
        }
    }

    // Метод для выполнения арифметической операции
    public static double applyOp(char op, double b, double a) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b == 0) throw new ArithmeticException("Cannot divide by zero");
                return a / b;
        }
        return 0;
    }
}