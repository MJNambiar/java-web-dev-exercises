package Studio.restaurantMenu;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Menu {
    private final ArrayList<HashMap<String, String>> listOfMenuItems;
    private final String name;
    private final Date date;
//    private String Name;
//    private ArrayList <String> ListOfMenuItems;
//    public Date Date;

    public Menu (String name, ArrayList<HashMap<String, String>> listOfMenuItems, Date date) {
        this.name = name;
        this.listOfMenuItems = listOfMenuItems;
        this.date = date;
    }

    //data structure & adding to it with method
}
