//menuitem is the superclass
import java.util.*; //imports all classes in  java until package

public class MenuItem { // declares menuitem class

//instance variales to store item info
    private String itemName;
    private double price;
    private int calories;
    private int protein;
    private int fats;
    private int sugar;

    //constructor to initialize MenuItem object with item info-name and marcos
    public MenuItem(String itemName, double price, int calories, int protein, int fats, int sugar) {
        this.itemName = itemName; //assigns itemName
        this.price = price; //assigns price
        this.calories = calories; // assigns calories
        this.protein = protein; //assigns proteins
        this.fats = fats; // assigns fats
        this.sugar = sugar; // assign sugar
    }

    // Getters methods for item info

    //getter for  item name
    public String getItemName() {
        return itemName;
    }
    //getter for get price
    public double getPrice() {
        return price;
    }
    //getter for calories
    public int getCalories() {
        return calories;
    }
    //getter for proteins
    public int getProtein() {
        return protein;
    }
    //getter for fats
    public int getFats() {
        return fats;
    }
    //getter for sugar 
    public int getSugar() {
        return sugar;
    }
}
