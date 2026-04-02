import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Task4 extends JFrame implements ActionListener {
    private JTextField display;
    private ArrayList<String> history = new ArrayList<>(); // Задание 10 (История)
    private double firstNum = 0;
    private String operator = "";
    private boolean startNewNumber = true;

    public Task4() {
        // Настройка окна (Задание 4)
        setTitle("Инженерный калькулятор");
        setSize(400, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Поле вывода
        display = new JTextField("0");
        display.setFont(new Font("Arial", Font.BOLD, 28));
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        // Панель кнопок
        JPanel panel = new JPanel(new GridLayout(6, 4, 5, 5));

        // Список всех кнопок для заданий 1-14
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+",
                "x^y", "√", "%", "Hist",
                "sin", "cos", "tan", "Exit"
        };

        for (String b : buttons) {
            JButton btn = new JButton(b);
            btn.setFont(new Font("Arial", Font.BOLD, 18));
            // ВАЖНО: подключаем обработчик событий к каждой кнопке
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        try {
            // Если нажата цифра
            if ("0123456789".contains(cmd)) {
                if (startNewNumber) {
                    display.setText(cmd);
                    startNewNumber = false;
                } else {
                    display.setText(display.getText() + cmd);
                }
            }
            // Очистка (Задание 11)
            else if (cmd.equals("C")) {
                display.setText("0");
                firstNum = 0;
                operator = "";
                startNewNumber = true;
            }
            // Инженерные функции (Задания 6, 13)
            else if (cmd.equals("√")) {
                double res = Math.sqrt(Double.parseDouble(display.getText()));
                showResult("sqrt", res);
            } else if (cmd.equals("sin")) {
                double res = Math.sin(Math.toRadians(Double.parseDouble(display.getText())));
                showResult("sin", res);
            } else if (cmd.equals("cos")) {
                double res = Math.cos(Math.toRadians(Double.parseDouble(display.getText())));
                showResult("cos", res);
            } else if (cmd.equals("tan")) {
                double res = Math.tan(Math.toRadians(Double.parseDouble(display.getText())));
                showResult("tan", res);
            }
            // История (Задание 10)
            else if (cmd.equals("Hist")) {
                JOptionPane.showMessageDialog(this, history.isEmpty() ? "История пуста" : String.join("\n", history));
            }
            // Операции с двумя числами
            else if ("+-*/x^y%".contains(cmd)) {
                firstNum = Double.parseDouble(display.getText());
                operator = cmd;
                startNewNumber = true;
            }
            // Вычисление (равно)
            else if (cmd.equals("=")) {
                calculate();
            }
            else if (cmd.equals("Exit")) {
                System.exit(0);
            }
        } catch (Exception ex) {
            display.setText("Error");
            startNewNumber = true;
        }
    }

    private void calculate() {
        double secondNum = Double.parseDouble(display.getText());
        double result = 0;

        switch (operator) {
            case "+" -> result = firstNum + secondNum;
            case "-" -> result = firstNum - secondNum;
            case "*" -> result = firstNum * secondNum;
            case "/" -> {
                if (secondNum == 0) { // Обработка деления на ноль
                    display.setText("Error: / 0");
                    return;
                }
                result = firstNum / secondNum;
            }
            case "x^y" -> result = Math.pow(firstNum, secondNum); // Задание 5
            case "%" -> result = (firstNum / 100) * secondNum; // Задание 12
        }

        // Сохраняем в историю
        history.add(firstNum + " " + operator + " " + secondNum + " = " + result);
        display.setText(String.valueOf(result));
        startNewNumber = true;
    }

    private void showResult(String opName, double res) {
        history.add(opName + "(" + display.getText() + ") = " + res);
        display.setText(String.valueOf(res));
        startNewNumber = true;
    }

    public static void main(String[] args) {
        // Запуск программы
        new Task4();
    }
}