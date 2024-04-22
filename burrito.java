// Class representing burritos
public class Burrito extends Food { //burrito class extends to food
   //instance variable - store type of filling
    private String filling;
    
    // constructor to intitialize burrito object- with name info and marcos
    public Burrito(String itemName, double price, int calories, int protein, int fats, int sugar, String filling) {
        super(itemName, price, calories, protein, fats, sugar);
        this.filling = filling;
    }

    // Getter method to get filling
    public String getFilling() {
        return filling;
    }
}
