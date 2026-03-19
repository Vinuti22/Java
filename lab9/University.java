package lab9; // Исправляет красную ошибку

class Person {
    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void displayInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
    }
}

class Student extends Person { // Наследование от Person [cite: 108, 122]
    int studentId;

    Student(String firstName, String lastName, int studentId) {
        super(firstName, lastName); // Вызов конструктора родителя [cite: 125]
        this.studentId = studentId;
    }

    void study() {
        System.out.println(firstName + " is studying."); // [cite: 129]
    }
}

class Professor extends Person { // Наследование от Person [cite: 108, 132]
    String subject;

    Professor(String firstName, String lastName, String subject) {
        super(firstName, lastName);
        this.subject = subject;
    }

    void teach() {
        System.out.println(firstName + " is teaching " + subject + "."); // [cite: 139]
    }
}

// Этот класс "оживит" программу и уберет желтые предупреждения
public class University {
    public static void main(String[] args) {
        // Создаем объекты [cite: 144, 145]
        Student student = new Student("Ali", "Khan", 12345);
        Professor professor = new Professor("Dr. John", "Doe", "Mathematics");

        // Используем методы [cite: 146, 147, 148, 149]
        student.displayInfo();
        student.study();

        professor.displayInfo();
        professor.teach();
    }
}