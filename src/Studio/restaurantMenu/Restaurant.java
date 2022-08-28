package Studio.restaurantMenu;

import java.time.LocalDate;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem corndog = new MenuItem("fried hot dog", 2.99, true, "main", "corndog");
        MenuItem hotdog = new MenuItem("sausage in a bun", 2.99, true, "main", "hotdog");
        MenuItem cottonCandy = new MenuItem("sugar cloud", 1.99, false, "dessert", "cotton candy");
        MenuItem lemonade = new MenuItem("sweetened lemon juice", 1.99, false, "drinks", "lemonade");

        Menu myMenu = new Menu();
        myMenu.addMenuItem(corndog);
        myMenu.addMenuItem(hotdog);
        myMenu.addMenuItem(cottonCandy);
        myMenu.addMenuItem(lemonade);

        for (MenuItem item: myMenu.getMenuItems()) {
            System.out.println(item.getName());
        }

        myMenu.setLastUpdated();
        System.out.println("Last Updated: " + myMenu.getLastUpdated());

        myMenu.printMenuItem(corndog);
        myMenu.printMenu();

        myMenu.removeMenuItem(corndog);
        myMenu.printMenu();
    }

}
