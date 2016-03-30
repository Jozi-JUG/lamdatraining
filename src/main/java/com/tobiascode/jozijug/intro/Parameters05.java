package com.tobiascode.jozijug.intro;

import com.tobiascode.jozijug.Student;

import java.util.List;
import java.util.function.Predicate;

public class Parameters05 {
    private static double highestGrade(List<Student> students, Predicate<Student> filterStudents) {
        return students.stream()
                .filter(filterStudents)
                .mapToDouble(Student::getGrade)
                .max()
                .getAsDouble();
    }

    public static void main(String args[]) {
//        List<Student> students = Student.createList();
//
//        double highestGrade2014 = highestGrade(students, s -> s.getGraduationYear() == 2014);
//        double highestGrade2015 = highestGrade(students, s -> s.getGraduationYear() == 2015);
//        double highestGrade2016 = highestGrade(students, s -> s.getGraduationYear() == 2016);
//        double highestGradeCurrentAndPrevious = highestGrade(students, s -> s.getGraduationYear() == 2016 || s.getGraduationYear() == 2015);
//
//        System.out.println("Highest Grades");
//        System.out.println("2014: " + highestGrade2014);
//        System.out.println("2015: " + highestGrade2015);
//        System.out.println("2016: " + highestGrade2016);
//        System.out.println("Current and Previous: " + highestGradeCurrentAndPrevious);
    }
}
