package lab2;

public class Main {
    public static void main(String[] args) {
        // Задача 1: Константа
        final String UNIVERSITY = "ATU - Алматинский технологический университет";

        // Задача 4 и 5: Наследование и Полиморфизм
        Person student = new Student(); // Ссылка базового типа
        student.name = "Денис";
        student.age = 21;

        // Приведение типа для доступа к полю group
        ( (Student) student).group = "ИС-2204";

        System.out.println("Организация: " + UNIVERSITY);
        student.displayInfo(); // Вызов переопределенного метода
    }
}
