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

    public void printMenu () {
        for (MenuItem item: this.menuItems) {
            System.out.println(item.getName());
            System.out.println(item.getCategory());
            System.out.println(item.getDescription());
            System.out.println(item.getPrice());
            System.out.println("*****");
        }
    }

    public void removeMenuItem (MenuItem item) {
        this.menuItems.remove(item);
    }

}
