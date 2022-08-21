package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student newStudent = new Student("Marina", 34, 1, 4.0);
        System.out.println(newStudent.getName());
        newStudent.setName("Bubba");
        System.out.println(newStudent.getName());
        Student corey = new Student("corey", 23);

        Course english = new Course("english", "Mr. Feeny");

        english.addStudent(newStudent);
        english.addStudent(corey);
        ArrayList<Student> roster = english.getClassRoster();
        for (Student student: roster) {
            System.out.println(student.getName());
        }
    }
}
