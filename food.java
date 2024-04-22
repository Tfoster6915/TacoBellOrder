import java.util.List; //imports inferface for list

public class Food extends MenuItem { //food- extends to menuItem
   //instance variables for marcos
    private int calories;
    private int proteins;
    private int fats;
    private int sugar;

    //constructor to initialize food object with itemName, price, and marcos
    public Food(String itemName, double price, int calories, int proteins, int fats, int sugar) {
        super(itemName, price, 0, 0, 0, 0);  // Call the constructor of MenuItem with itemName, price, and default values
        this.calories = calories; //assigns calories
        this.proteins = proteins; //assigns proteins
        this.fats = fats; //assigns fats
        this.sugar = sugar; //assigns sugar
    }

    //getter method for calories
    public int getCalories() {
        return calories;
    }
    //getter method for proteins
    public int getProteins() {
        return proteins;
    }
    //getter method for fats
    public int getFats() {
        return fats;
    }
    //getter method for sugar
    public int getSugar() {
        return sugar;
    }
}
