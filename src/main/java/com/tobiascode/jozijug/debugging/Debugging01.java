package com.tobiascode.jozijug.debugging;

import java.util.List;
import java.util.function.Consumer;

import com.tobiascode.jozijug.Student;

public class Debugging01 {
    public static void main(String args[]) {
        List<Student> students = Student.createList();

        Consumer<Student> process = s -> {
            if (s.getGraduationYear() == 2014) {
                System.out.println(s);
            } else {
                System.out.println("Not 2014");
            }
        };

        students.forEach(process);

        students.replaceAll(s -> {s.setGrade(s.getGrade() - 1.0); return s; });
    }
}
