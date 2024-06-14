package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsGroup {
    private Student leader;
    private List<Student> students;
    private List<String> tasks;

    // Конструктор класу
    public StudentsGroup(Student leader) {
        if (leader == null) {
            throw new IllegalArgumentException("Group must have a leader.");
        }
        this.leader = leader;
        this.students = new ArrayList<>();
        this.tasks = new ArrayList<>();
        this.students.add(leader);
    }

    // Метод для зміни старости
    public void changeLeader(Student newLeader) {
        if (newLeader == null) {
            throw new IllegalArgumentException("New leader cannot be null.");
        }
        if (!students.contains(newLeader)) {
            throw new IllegalArgumentException("New leader must be a member of the group.");
        }
        this.leader = newLeader;
    }

    // Метод для додавання студента в групу
    public void addStudent(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student cannot be null.");
        }
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Метод для видалення студента з групи
    public void removeStudent(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student cannot be null.");
        }
        if (student.equals(leader)) {
            throw new IllegalArgumentException("Cannot remove the leader of the group.");
        }
        students.remove(student);
    }

    // Метод для додавання завдання для всієї групи
    public void addTask(String task) {
        if (task == null || task.isEmpty()) {
            throw new IllegalArgumentException("Task cannot be null or empty.");
        }
        tasks.add(task);
    }

    // Метод для позначення завдання як виконане для зазначеного студента
    public void markTaskAsCompleted(Student student, String task) {
        if (student == null || task == null || task.isEmpty()) {
            throw new IllegalArgumentException("Student and task cannot be null or empty.");
        }
        if (!students.contains(student)) {
            throw new IllegalArgumentException("Student must be a member of the group.");
        }
        System.out.println("Student " + student.getFirstName() + " " + student.getLastName() + " has completed the task: " + task);
    }

    // Метод для отримання списку студентів
    public List<Student> getStudents() {
        return Collections.unmodifiableList(students);
    }

    // Метод для отримання списку завдань (копії для безпеки)
    public List<String> getTasks() {
        return Collections.unmodifiableList(tasks);
    }

    // Метод для отримання старости
    public Student getLeader() {
        return leader;
    }

    // Метод для виведення інформації про всіх студентів
    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
