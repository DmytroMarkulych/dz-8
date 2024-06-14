package org.example;

public class Main {
    public static void main(String[] args) {
        // Створення студента-лідера
        Student leader = new Student(1, "John", "Doe");

        // Створення групи з лідером
        StudentsGroup studentsGroup = new StudentsGroup(leader);

        // Додавання студентів
        Student student2 = new Student(2, "Jane", "Smith");
        Student student3 = new Student(3, "Alice", "Brown");
        Student student4 = new Student(4, "Jery", "Smith");


        studentsGroup.addStudent(student2);
        studentsGroup.addStudent(student3);
        studentsGroup.addStudent(student4);


        // Додавання завдань
        studentsGroup.addTask("Вивчити інкапсуляцію");
        studentsGroup.addTask("Підготуватися до екзамену");

        // Виведення інформації про всіх студентів
        System.out.println("All students:");
        studentsGroup.displayAllStudents();

        // Позначення завдання як виконаного
        studentsGroup.markTaskAsCompleted(student2, "Вивчити інкапсуляцію");

        // Зміна старости
        studentsGroup.changeLeader(student3);

        // Виведення інформації про старосту
        System.out.println("New leader:");
        System.out.println(studentsGroup.getLeader());

        // Виведення списку завдань
        System.out.println("All tasks:");
        for (String task : studentsGroup.getTasks()) {
            System.out.println(task);
        }
    }
}
