package Restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Menu {

    private Date lastUpdated;
    private ArrayList<MenuItem> items = new ArrayList<MenuItem>() ;
    //private HashMap<String, ArrayList<MenuItem>> categoryToItemMap = new HashMap<>();


        public Menu(Date d, ArrayList<MenuItem> items) {
        this.lastUpdated = d;
        this.items = items;
    }

    public Menu() {

    }


        public void setItems (ArrayList<MenuItem> items) {
        this.items = items;
        this.lastUpdated = new Date();
    }
        public void addItem (MenuItem item){
        if (this.items.contains(item)) {
            System.out.println("This item already in the list");
            return;
        }
            this.items.add(item);
            this.lastUpdated = new Date();

    }
        public void removeItem (MenuItem item){
        this.items.remove(item);
    }
        public Date getLastUpdated () {
        return this.lastUpdated;
    }
        public String getMenuString () {
        String str = "";
        for (MenuItem item : this.items) {
            str += item.getCategory() + "(" + item.getPrice() + ")" + "-" + item.getDescription();
        }
        return str;
    }
        public void printItem (MenuItem item){
        System.out.println(item.getDescription());
    }
        public void printMenu () {
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).getPrice());
            System.out.println(items.get(i).getDescription());
            System.out.println(items.get(i).getCategory());
            System.out.println(items.get(i).isNew());
            System.out.println("***********");
        }
    }
}
