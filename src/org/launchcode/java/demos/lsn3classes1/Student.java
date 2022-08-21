package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public int getStudentID() {
        return studentId;
    }
    public int getNumberOfCredits(){
        return numberOfCredits;
    }
    public double getGpa(){
        return gpa;
    }

    public void setStudentId(int aStudentId) {
        studentId = aStudentId;
    }
    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    public void setGpa(double aGpa) {
        gpa = aGpa;
    }

    public Student(String name, int studentID) {
        this.name = name;
        this.studentId = studentID;
    }

    //overloaded constructor:
    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this(name, studentId);
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    //java figures out which constructor to use based on method signature (which one matches?) (return type, name, and parameters you give to constructor)
//once you create a constructor the default constructor goes away
    //then you HAVE to pass in constructor arguments
    //DO NOT USE A= older syntax


    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}