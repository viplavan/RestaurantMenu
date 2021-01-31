package Restaurant;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    private static final String[] CATEGORIES = {"Entree","Dessert","Appetizer"};

    public MenuItem(double price, String description,String category, boolean isNew){
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
    public boolean equals(MenuItem comparison){
        if(comparison == this){
            return true;
        }
        if(comparison == null){
            return false;
        }
        if(comparison.getClass() != getClass()){
            return false;
        }
        MenuItem theItem = (MenuItem) comparison;
        return theItem.getDescription() == getDescription();
    }

   }
