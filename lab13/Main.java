import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main{

    private JTextArea outputArea;

    public static void main(String[] args) {
        // Запуск GUI в потоке обработки событий
        SwingUtilities.invokeLater(Main::new);
    }

    public Main() {
        JFrame frame = new JFrame("Лабораторная работа №13 - Stream API & Lambda");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // Панель со списком заданий
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (int i = 1; i <= 20; i++) {
            listModel.addElement("Задание №" + i);
        }
        JList<String> taskList = new JList<>(listModel);
        taskList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        taskList.setFont(new Font("Arial", Font.PLAIN, 16));

        // Область вывода результата
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Consolas", Font.PLAIN, 14));
        outputArea.setMargin(new Insets(10, 10, 10, 10));
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // Обработка выбора задания
        taskList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int index = taskList.getSelectedIndex() + 1;
                runTask(index);
            }
        });

        // Компоновка
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JScrollPane(taskList), scrollPane);
        splitPane.setDividerLocation(200);

        frame.add(splitPane, BorderLayout.CENTER);
        frame.add(new JLabel(" Выберите задание слева, чтобы увидеть результат", JLabel.CENTER), BorderLayout.SOUTH);

        frame.setLocationRelativeTo(null); // Окно по центру экрана
        frame.setVisible(true);
    }

    private void runTask(int taskNumber) {
        outputArea.setText("--- Результат задания №" + taskNumber + " ---\n\n");

        switch (taskNumber) {
            case 1 -> {
                BinaryOperator<Integer> sum = (a, b) -> a + b;
                print("Сложение чисел 15 и 25: " + sum.apply(15, 25));
            }
            case 2 -> {
                Function<String, String> upper = String::toUpperCase;
                print("Преобразование 'java stream api': " + upper.apply("java stream api"));
            }
            case 3 -> {
                List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
                print("Исходный список: " + list);
                print("Только четные: " + list.stream().filter(n -> n % 2 == 0).toList());
            }
            case 4 -> {
                List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
                print("Квадраты чисел: " + list.stream().map(n -> n * n).toList());
            }
            case 5 -> {
                List<Integer> list = Arrays.asList(42, 12, 89, 24, 55);
                list.stream().max(Integer::compare).ifPresent(m -> print("Максимум в " + list + ": " + m));
            }
            case 6 -> {
                List<String> words = Arrays.asList("Кот", "Александрия", "Ява", "Программирование");
                print("Сортировка по длине:");
                words.stream().sorted(Comparator.comparingInt(String::length)).forEach(this::print);
            }
            case 7 -> {
                List<String> names = Arrays.asList("иван", "мария", "сергей");
                print("Заглавные буквы:");
                names.stream().map(s -> s.substring(0, 1).toUpperCase() + s.substring(1)).forEach(this::print);
            }
            case 8 -> {
                List<String> list = Arrays.asList("Окно", "Клавиатура", "Мышь", "Монитор");
                print("Длина > 5 символов:");
                list.stream().filter(s -> s.length() > 5).forEach(this::print);
            }
            case 9 -> {
                List<Integer> list = Arrays.asList(10, 20, 30);
                print("Вывод через Method Reference:");
                list.forEach(val -> print("Число: " + val));
            }
            case 10 -> {
                List<Integer> empty = Collections.emptyList();
                int min = empty.stream().min(Integer::compare).orElse(-1);
                print("Минимум в пустом списке (orElse): " + min);
            }
            case 11 -> {
                Consumer<String> consumer = s -> print("Consumer принял: " + s);
                consumer.accept("Привет, Swing!");
            }
            case 12 -> {
                Supplier<Double> random = Math::random;
                print("Supplier сгенерировал: " + random.get());
            }
            case 13 -> {
                List<Student> students = getStudents();
                students.sort(Comparator.comparingInt(s -> s.age));
                print("Сортировка по возрасту:");
                students.forEach(s -> print(s.toString()));
            }
            case 14 -> {
                print("Студенты с оценкой > 80 (сорт. по имени):");
                getStudents().stream()
                        .filter(s -> s.grade > 80)
                        .sorted(Comparator.comparing(s -> s.name))
                        .forEach(s -> print(s.toString()));
            }
            case 15 -> {
                print("Chaining (фильтр > 50, +10 к оценке, сортировка):");
                getStudents().stream()
                        .filter(s -> s.grade > 50)
                        .map(s -> s.name + " новое: " + (s.grade + 10))
                        .sorted()
                        .forEach(this::print);
            }
            case 16 -> {
                print("Группировка по возрасту:");
                Map<Integer, List<Student>> map = getStudents().stream()
                        .collect(Collectors.groupingBy(s -> s.age));
                map.forEach((age, list) -> print(age + " лет: " + list));
            }
            case 17 -> {
                List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
                int sum = list.stream().reduce(0, Integer::sum);
                print("Сумма элементов " + list + " через reduce: " + sum);
            }
            case 18 -> {
                List<String> list = Arrays.asList("A", "B", "A", "C", "B", "D", "E");
                print("Оригинал: " + list);
                print("Distinct + Limit(3):");
                list.stream().distinct().limit(3).forEach(this::print);
            }
            case 19 -> {
                List<List<Integer>> nested = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));
                print("FlatMap (из списка списков в один):");
                print(nested.stream().flatMap(Collection::stream).toList().toString());
            }
            case 20 -> {
                print("Обработка заказов (> 1000, сорт по цене):");
                List<Order> orders = Arrays.asList(new Order(1, 1200), new Order(2, 800), new Order(3, 5000));
                orders.stream()
                        .filter(o -> o.price > 1000)
                        .sorted(Comparator.comparingDouble(o -> o.price))
                        .forEach(o -> print(o.toString()));
            }
            default -> print("Задание еще не реализовано.");
        }
    }

    private void print(String text) {
        outputArea.append(text + "\n");
    }

    private List<Student> getStudents() {
        return Arrays.asList(
                new Student("Никита", 20, 85),
                new Student("Алена", 19, 95),
                new Student("Игорь", 22, 60),
                new Student("Ольга", 20, 78)
        );
    }

    // Классы данных
    static class Student {
        String name; int age; double grade;
        Student(String n, int a, double g) { name = n; age = a; grade = g; }
        @Override public String toString() { return name + " (" + age + " л) - " + grade; }
    }

    static class Order {
        int id; double price;
        Order(int i, double p) { id = i; price = p; }
        @Override public String toString() { return "Заказ #" + id + ": " + price + " руб."; }
    }
}