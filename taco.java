public class Taco extends Food { //Taco class extends food
    //instance varible for taco attributes
    private boolean vegetarian; //indicates if taco vegetarian
    private String spiceLevel; //indicates if taco for spicelevel

    //constructos to intialize taco object for name, marcos,if veggitarin, spicy level
    public Taco(String itemName, double price, int calories, int protein, int fats, int sugar, boolean vegetarian, String spiceLevel) { 
        super(itemName, price, calories, protein, fats, sugar); //calls constructor of food name price and marcos
        this.vegetarian = vegetarian; //assigns vegetarian status
        this.spiceLevel = spiceLevel; //assigns spice level
    }

    // Getter method for vegetarian status
    public boolean isVegetarian() {
        return vegetarian;
    }
    // Getter method for spice level
    public String getSpiceLevel() {
        return spiceLevel;
    }
}
