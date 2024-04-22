import java.util.List; //- imports list interface for list

public class Drink extends MenuItem { // drink class extends to menuitem
    // properties specific to Drink - instance variables
    private int calories; // -stores calories
    private int protein;// -stores proteins
    private int fats; //-stores fats
    private int sugar; //-stores sugar

    // Constructor with all properties
    public Drink(String itemName, double price, int calories, int protein, int fats, int sugar) {
        super(itemName, price, calories, protein, fats, sugar); // Call superclass constructor with -anem and marcos
        this.calories = calories; //assigns calories
        this.protein = protein; //assigns proteins
        this.fats = fats; ///assigns fats
        this.sugar = sugar; ////assigns sugar
    }

    // Additional constructor with default values
    public Drink(String itemName, double price) {
        super(itemName, price, 0, 0, 0, 0); // Call superclass constructor with default values for parmeters
    }

    // Getter methods

    // Getter methods for calories
    public int getCalories() {
        return calories;
    }
    // Getter methods for proteins
    public int getProtein() {
        return protein;
    }
    // Getter methods for fats
    public int getFats() {
        return fats;
    }
    // Getter methods for sugar 
    public int getSugar() {
        return sugar;
    }
}
