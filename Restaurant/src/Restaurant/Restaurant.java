package Restaurant;


public class Restaurant {
    public static void main(String[] args) throws InterruptedException {
        Menu menu = new Menu();
        MenuItem dynamiteShrimp = new MenuItem(8.99, "Dynamite Shrimp","Appetizer", true);
        MenuItem soup = new MenuItem(3.99, "Hot&Sour Soup", "Appetizer", false);
        MenuItem pasta = new MenuItem(7.99, "Spaghetti", "Entree", true);
        MenuItem rice = new MenuItem(10.99, "Chicken Fried rice", "Entree", true);
        MenuItem cake = new MenuItem(7.99, "Lava cake", "Dessert", false);
        MenuItem fudge = new MenuItem(5.99, "Banana Fudge", "Dessert", true);

        menu.addItem(dynamiteShrimp);
        menu.addItem(soup);
        menu.addItem(pasta);
        menu.addItem(rice);
        menu.addItem(cake);
        menu.addItem(fudge);
        menu.printMenu();
        System.out.println("Printing the each item: ");
        menu.printItem(dynamiteShrimp);
        menu.printItem(soup);
        menu.printItem(pasta);
        menu.printItem(rice);
        menu.printItem(cake);
        menu.printItem(fudge);
        System.out.println("**********");
        menu.addItem(cake);
        System.out.println("**********");
        menu.removeItem(fudge);
        menu.printMenu();

    }

}
