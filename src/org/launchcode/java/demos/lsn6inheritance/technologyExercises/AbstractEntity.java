package org.launchcode.java.demos.lsn6inheritance.technologyExercises;

public abstract class AbstractEntity {
    private double Id;

    public AbstractEntity() {
        this.Id = Math.random()*1000;
    }

    public double getId () {
        return Id;
    }

}
