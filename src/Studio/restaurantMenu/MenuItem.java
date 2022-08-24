package Studio.restaurantMenu;

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


    //getter, setter
}
