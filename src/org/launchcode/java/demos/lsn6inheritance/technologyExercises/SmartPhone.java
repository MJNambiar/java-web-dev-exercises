package org.launchcode.java.demos.lsn6inheritance.technologyExercises;

public class SmartPhone extends Computer {
    private double numberOfPhotos;

    public SmartPhone (String name, boolean isAppleProduct, double memoryInGB, double numberOfPhotos) {
        super (name, isAppleProduct, memoryInGB);
        this.numberOfPhotos = numberOfPhotos;
    }

    public double findPercentPhotoStorage (double memoryInGB, double numberOfPhotos) {
        double photoStorageInGB = 0;
        double photoStorageInMB = 0;
        double percentPhotoStorage;
        photoStorageInMB = numberOfPhotos * 6;
        photoStorageInGB = photoStorageInMB / 1000;
        percentPhotoStorage = (photoStorageInGB/memoryInGB) * 100;
        return percentPhotoStorage;
    }

    public double getNumberOfPhotos () {
        return numberOfPhotos;
    }
}
