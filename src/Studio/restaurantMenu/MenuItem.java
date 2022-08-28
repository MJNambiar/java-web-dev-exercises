package Studio.restaurantMenu;

public class MenuItem {
    private String description;
    private double price;
    private boolean isNew;
    private String category;
    private String name;


    //constructors
    public MenuItem (String description, double price, boolean isNew, String category, String name) {
        this.description= description;
        this.price = price;
        this.isNew = true;
        this.category= category;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public boolean getIsNew() {
        return isNew;
    }

    public String getDescription() {
        return description;
    }

    public String isItemNew(){
        if (this.isNew == true) {
            return "Try this tasty new dish";
        } else {
            return "This dish is one of our originals";
        }
    }


}

