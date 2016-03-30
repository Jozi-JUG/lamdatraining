package com.tobiascode.jozijug.functionalinterfaces;

import com.tobiascode.jozijug.Student;

public interface Example03 {
    default void add(Student student) {
        // Some functionality
    }
    default void remove(Student student) {
        // Some functionality
    }
    String printStudentName(Student student);
}
