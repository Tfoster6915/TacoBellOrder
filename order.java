import java.util.ArrayList; //imports arraylist class
import java.util.List; //imports list interface for list

public class Order { // declares order class
    private List<MenuItem> orderItems; //instance variable- stores order item
    //constructors to initialize order object 
    public Order() {
        this.orderItems = new ArrayList<>(); // intializing orderItems as arraylist
    }
    //method to add item to order
    public void addItem(MenuItem item) {
        orderItems.add(item); //adds item to orderItem list
    }
    //method to display order items

    public void displayOrder() {
        System.out.println("Order items:"); //prints header for order items
        for (MenuItem item : orderItems) { //loops through each items
            System.out.println(item.getItemName() + " - $" + item.getPrice()); //prints item and name
        }
    }
    //method to calculate total bill of order

    public double calculateTotalBill() {
        double totalBill = 0; //intitalizes total bill 
        for (MenuItem item : orderItems) { //loops through each line in each order
            totalBill += item.getPrice(); //adds price of each item to total bill
        }
        return totalBill; //returns total bill
    }
    
    // Method to calculate the total calories of the order

    public int calculateTotalCalories() {
        int totalCalories = 0; //initializing total calories
        for (MenuItem item : orderItems) { //loops through each line in the order 
            if (item instanceof Food) { //checks if items its in food instance
                totalCalories += ((Food) item).getCalories(); // adds calories to food items  to inorder to total calories
            }
        }
        return totalCalories; // return to total calories
    }
    // method to calculate total protiens 
    public int calculateTotalProteins() {
        int totalProteins = 0; //intializing total protein variable
        for (MenuItem item : orderItems) { //loops each item in order
            if (item instanceof Food) { //checks if item if food if instance of food 
                totalProteins += ((Food) item).getProteins(); // add proteins of food item to total proteins
            }
        }
        return totalProteins; // returning total proteins
    }

    //method to calculate total fats of order
    public int calculateTotalFats() {
        int totalFats = 0; //initialzing total fats varible
        for (MenuItem item : orderItems) { //loops through each line in the order
            if (item instanceof Food) { // check if item insistance of food
                totalFats += ((Food) item).getFats(); //adds the fats of food item to total fats
            }
        }
        return totalFats; //returns total fats
    }

    public int calculateTotalSugar() { // method to calculate total sugar of order
        int totalSugar = 0; //intializing total sugar variable
        for (MenuItem item : orderItems) { //loops through each item in order 
            if (item instanceof Food) { //checks if items is instance of food
                totalSugar += ((Food) item).getSugar(); //adds sugar of food item to total sugars
            }
        }
        return totalSugar; // returns the total sugars
    }
}
