public class StudentInfo {

    // Метод main — точка входа в программу
    public static void main(String[] args) {

        // ФИО студента
        String fullName = "Подузов Денис Юрьевич";

        // Группа
        String group = "ИС-24 21";

        // Специальность / образовательная программа
        String program = "Информационные системы";

        // Вывод информации в консоль
        System.out.println("=== Информация о студенте ===");
        System.out.println("ФИО: " + fullName);
        System.out.println("Группа: " + group);
        System.out.println("ОП/Специальность: " + program);
    }
}