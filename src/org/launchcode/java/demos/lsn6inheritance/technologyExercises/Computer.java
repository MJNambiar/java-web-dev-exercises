package org.launchcode.java.demos.lsn6inheritance.technologyExercises;

public class Computer extends AbstractEntity {
    private String name;
    private boolean isAppleProduct;
    private double memoryInGB;

    public Computer (String name, boolean isAppleProduct, double memoryInGB) {
        super();
        this.name = name;
        this.isAppleProduct = isAppleProduct;
        this.memoryInGB = memoryInGB;
    }

    public String findRepairShop(boolean isAppleProduct) {
        if (isAppleProduct == true) {
            return "Take product to local Apple store.";
        } else {
            return "Take product to local BestBuy.";
        }
    }

    public double increaseStorage(double memoryInGB){
        memoryInGB += 100;
        return memoryInGB;
    }

    public String getName() {
        return name;
    }

    public boolean isAppleProduct() {
        return isAppleProduct;
    }

    public double getMemoryInGB() {
        return memoryInGB;
    }
}
