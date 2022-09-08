package org.launchcode.java.demos.lsn6inheritance.technologyExercises;

public abstract class AbstractEntity {
//    private double Id;
    private static double counter = 1;
    private double id;

    public AbstractEntity(){
        this.id = counter;
        counter ++;
    }

    public double getId() {
        return id;
    }
//    public AbstractEntity() {
//        this.Id = Math.random()*1000;
//    }
//
//    public double getId () {
//        return Id;
//    }

}
