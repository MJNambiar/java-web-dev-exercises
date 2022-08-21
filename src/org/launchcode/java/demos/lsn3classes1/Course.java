package org.launchcode.java.demos.lsn3classes1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
//class = course
// object = when you do new course
public class Course {
    private String subject;
    private String instructor;
    private ArrayList<Student> classRoster = new ArrayList<>();
    public Course(String subject, String instructor) {
        this.subject = subject;
        this.instructor = instructor;
    }

    public void addStudent(Student student) {
        classRoster.add(student);
    }

    public ArrayList<Student> getClassRoster() {
        return this.classRoster;
    }
    //allows user to get class roster data and save as a variable to use it
    //returning an arraylist

    public void printClassRoster() {
        for (Student student: this.classRoster) {
            System.out.println(student.getName());
        }
    }
    //would only allow you to print class
}


//want to instantiate collections in class NOT in constructor = cleaner code