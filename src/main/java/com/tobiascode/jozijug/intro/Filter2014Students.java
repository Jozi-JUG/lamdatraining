package com.tobiascode.jozijug.intro;

import com.tobiascode.jozijug.Student;

import java.util.function.Predicate;

public class Filter2014Students implements Predicate<Student> {
    @Override
    public boolean test(Student student) {
        return student.getGraduationYear() == 2014;
    }
}
