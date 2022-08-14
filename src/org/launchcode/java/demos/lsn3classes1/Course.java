package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    private String courseName;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;
    private HashMap<Integer, ArrayList> listOfStudents = new HashMap<Integer, ArrayList> ();
}
