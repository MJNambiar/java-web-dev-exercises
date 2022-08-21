package Studio.restaurantMenu;

import java.util.Objects;

public class MenuItem {
    private String description;
    private double price;
    private boolean newOrNot;
    private String category;


    //constructors
    public MenuItem (String description, double price, boolean newOrNot, String category) {
        this.description= description;
        this.price = price;
        this.newOrNot = true;
        this.category= category;
    }


    //Getters
    public String getDescription() {
        return description;
    }
    public double getPrice(){
        return price;
    }
    public boolean getNewOrNot(){
        return newOrNot;
    }
    public String getCategory(){
        return getCategory();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.price, price) == 0 && newOrNot == menuItem.newOrNot && description.equals(menuItem.description) && category.equals(menuItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, price, newOrNot, category);
    }

    //getter, setter
}
