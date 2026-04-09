import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Lab12 {

    private static String inputString = "";

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Лабораторная работа №12: Строки");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500); // Немного увеличил ширину для длинных названий
        frame.setLayout(new BorderLayout(15, 15));

        // Панель ввода
        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JLabel label = new JLabel("Введите строку для анализа:");
        JTextField textField = new JTextField(30);
        inputPanel.add(label);
        inputPanel.add(textField);
        frame.add(inputPanel, BorderLayout.NORTH);

        // Массив с названиями для кнопок
        String[] taskNames = {
                "Длина строки", "Регистр (А/а)", "Кол-во слов", "Слова задом наперед",
                "Поиск 'Java'", "Замена пробелов", "Проверка палиндрома", "Сравнение с 'Java'",
                "Разделение (запятая)", "Гласные/Согласные", "Удалить пробелы", "Самое длинное слово",
                "Символы без пробелов", "Начинается с 'Hello'", "Заканчивается на '!'", "Строка наоборот",
                "Удалить цифры", "Замена гласных на *", "Частота символов", "Только цифры?"
        };

        // Панель с кнопками (сетка 5x4)
        JPanel buttonsPanel = new JPanel(new GridLayout(5, 4, 10, 10));
        buttonsPanel.setBorder(BorderFactory.createEmptyBorder(0, 15, 15, 15));

        for (int i = 0; i < taskNames.length; i++) {
            int taskNum = i + 1;
            JButton button = new JButton(taskNames[i]);

            // Стилизация кнопки для удобства
            button.setFocusPainted(false);

            button.addActionListener(e -> {
                inputString = textField.getText();
                if (inputString.isEmpty() && taskNum != 8) {
                    JOptionPane.showMessageDialog(frame, "Пожалуйста, введите текст в поле сверху!");
                } else {
                    showTaskResult(frame, taskNum, taskNames[taskNum - 1]);
                }
            });
            buttonsPanel.add(button);
        }
        frame.add(buttonsPanel, BorderLayout.CENTER);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void showTaskResult(JFrame parent, int taskNum, String taskTitle) {
        String result = getTaskResult(taskNum, inputString);

        JDialog dialog = new JDialog(parent, taskTitle, true);
        dialog.setLayout(new BorderLayout(10, 10));
        dialog.setSize(450, 200);

        JTextArea textArea = new JTextArea("\n Результат задания:\n " + result);
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(new Color(245, 245, 245));

        JButton backButton = new JButton("Вернуться назад");
        backButton.setPreferredSize(new Dimension(100, 40));
        backButton.addActionListener(e -> dialog.dispose());

        dialog.add(new JScrollPane(textArea), BorderLayout.CENTER);
        dialog.add(backButton, BorderLayout.SOUTH);

        dialog.setLocationRelativeTo(parent);
        dialog.setVisible(true);
    }

    private static String getTaskResult(int taskNum, String s) {
        switch (taskNum) {
            case 1: return "Длина вашей строки: " + s.length();
            case 2: return "ВЕРХНИЙ: " + s.toUpperCase() + "\nнижний: " + s.toLowerCase();
            case 3: return "Всего слов: " + (s.trim().isEmpty() ? 0 : s.trim().split("\\s+").length);
            case 4:
                StringBuilder sb4 = new StringBuilder();
                for (String w : s.split(" ")) sb4.append(new StringBuilder(w).reverse()).append(" ");
                return "Каждое слово задом наперед:\n" + sb4.toString().trim();
            case 5: return "Содержит ли слово 'Java': " + (s.contains("Java") ? "Да" : "Нет");
            case 6: return "Результат замены: " + s.replace(" ", "_");
            case 7:
                String clean = s.replaceAll("\\s+", "").toLowerCase();
                boolean isPal = clean.equals(new StringBuilder(clean).reverse().toString());
                return "Является ли строка палиндромом: " + (isPal ? "Да" : "Нет");
            case 8: return "Строка совпадает с 'Java': " + (s.equals("Java") ? "Да" : "Нет");
            case 9: return "Кол-во фрагментов при делении по запятой: " + s.split(",").length;
            case 10:
                int v = 0, c = 0;
                String vowels = "aeiouyаеёиоуыэюя";
                for (char ch : s.toLowerCase().toCharArray()) {
                    if (Character.isLetter(ch)) {
                        if (vowels.indexOf(ch) != -1) v++; else c++;
                    }
                }
                return "Гласных букв: " + v + "\nСогласных букв: " + c;
            case 11: return "Текст без пробелов: " + s.replace(" ", "");
            case 12:
                String[] words = s.split("\\s+");
                String longest = "";
                for (String w : words) if (w.length() > longest.length()) longest = w;
                return "Самое длинное слово в строке: " + longest;
            case 13: return "Чистое кол-во символов (без пробелов): " + s.replace(" ", "").length();
            case 14: return "Начинается на 'Hello': " + (s.startsWith("Hello") ? "Да" : "Нет");
            case 15: return "Заканчивается на '!': " + (s.endsWith("!") ? "Да" : "Нет");
            case 16: return "Перевернутая строка полностью:\n" + new StringBuilder(s).reverse();
            case 17: return "Строка после удаления цифр: " + s.replaceAll("\\d", "");
            case 18: return "Гласные заменены на звездочки: " + s.replaceAll("[aeiouyаеёиоуыэюяAEIOUYАЕЁИОУЫЭЮЯ]", "*");
            case 19:
                Map<Character, Integer> freq = new HashMap<>();
                for (char ch : s.toCharArray()) freq.put(ch, freq.getOrDefault(ch, 0) + 1);
                return "Сколько раз встречается каждый символ:\n" + freq.toString();
            case 20: return "Строка состоит только из цифр: " + (s.matches("\\d+") ? "Да" : "Нет");
            default: return "Ошибка";
        }
    }
}