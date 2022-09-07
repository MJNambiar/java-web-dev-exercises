package Studio.restaurantMenu;

import java.time.LocalDate;
import java.util.ArrayList;


public class Menu {
    private final ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

//    public Menu (LocalDate lastUpdated, ArrayList<MenuItem> menuItems) {
//        this.lastUpdated = lastUpdated;
////        this.menuItems = menuItems;
//    }


    public void addMenuItem(MenuItem item) {
        this.menuItems.add(item);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(){
        this.lastUpdated = LocalDate.now();
    }

    public String updatedDate() {
        return ("The menu was last updated: " + this.lastUpdated);
    }

    public void printMenuItem (MenuItem item) {
        System.out.println(item.getName());
        System.out.println(item.getCategory());
        System.out.println(item.getDescription());
        System.out.println(item.getPrice());
    }

    //custom toString method
    @Override
    public String toString(){
        String output = "";
        for (MenuItem item: this.getMenuItems()) {
            output += item.getName() + "-" + item.getDescription() + "-" + item.getPrice() + "\n";
        }
        output += "Last updated: " + this.lastUpdated;
        return output;
    }

    public void printMenu () {
        for (MenuItem item: this.menuItems) {
            System.out.println(item.getName());
            System.out.println(item.getCategory());
            System.out.println(item.getDescription());
            System.out.println(item.getPrice());
            System.out.println("*****");
        }
    }

    //DOES NOT WORK BY NAME
//    public void removeMenuItem (MenuItem item) {
//        this.menuItems.remove(item);
//    }

    public void removeMenuItem(String itemName){
        MenuItem toBeRemoved = null;
        for(MenuItem item: this.menuItems) {
            if (item.getName().equalsIgnoreCase(itemName.toLowerCase())) {
                toBeRemoved =item;

            }
        }
        if(toBeRemoved != null) {
            this.menuItems.remove(toBeRemoved);
        }
    }



}


