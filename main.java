import java.io.File; //for importing files
import java.io.FileNotFoundException; //for filenotfileExpection for handling
import java.util.ArrayList; //for arraylist
import java.util.List; //for importing list interface for list
import java.util.Scanner; //for user input
//imports

public class Main { //declaring main class

    public static void main(String[] args) { //main method
        System.out.println("Hello! What would you like to order today?"); //prints greeting message
        Scanner scanner = new Scanner(System.in); //create object scanner for user input
        Order order = new Order(); // create order inorder to store order detail

        try { //handing- if file doesnt exist (incorrect menu item)
            List<MenuItem> menuItems = loadMenuItemsFromFile("menu.txt"); //loads menu item from txt file

            while (true) { //loop- for selecting items until order is done
                System.out.println("Please select an item from the menu by entering its number or type 'done' to complete your order:"); //prints and ask the user for what they want to order, and to enter 'done' when finished
                for (int i = 0; i < menuItems.size(); i++) { //loop for displaying menu items
                    System.out.println((i + 1) + ". " + menuItems.get(i).getItemName()); //prints menu item name with corresponding number
                }

                // Read the user's input
                String input = scanner.nextLine().trim(); // Trims whitespaces

                if (input.equalsIgnoreCase("done")) { //checks is user wants to finish order
                    break; //exist loop when user is finished
                }

                try { // number format expection- if user input something thats not a number
                    int selectedMenuItemIndex = Integer.parseInt(input) - 1; //convert input to menu item index
                    if (selectedMenuItemIndex >= 0 && selectedMenuItemIndex < menuItems.size()) { //checks id selected index is correct
                        order.addItem(menuItems.get(selectedMenuItemIndex));//adds on selected items to order
                    } else { //error message for wrong number
                        System.out.println("Invalid item number. Please select a valid number from the menu."); //prints error if its a wrong number
                    }
                } catch (NumberFormatException e) { //catch for file not found
                    System.out.println("Invalid input. Please enter a number or 'done'.");// prints error for wrong input
                }
            }
        } catch (FileNotFoundException e) {  //error message for file not found 
            System.out.println("File not found: " + e.getMessage());
        }//prints that file was not found

        scanner.close(); //closes scanner object

        order.displayOrder(); //displays order details
        double totalBill = order.calculateTotalBill(); //calutates total bill
        System.out.println("Total bill: $" + totalBill); //prints total bill amount

        // Calculate and display total calories, proteins, fats, and sugar
        int totalCalories = order.calculateTotalCalories(); //calories
        int totalProteins = order.calculateTotalProteins(); //calculates proteins
        int totalFats = order.calculateTotalFats(); //calculates fats
        int totalSugar = order.calculateTotalSugar(); // calculates sugar
        
        System.out.println("Total Calories: " + totalCalories); //prints calories
        System.out.println("Total Proteins: " + totalProteins + "g"); //prints proteins
        System.out.println("Total Fats: " + totalFats + "g"); //prints fats
        System.out.println("Total Sugar: " + totalSugar + "g"); //prints sugars
    }

    //method to load menu items to file
    private static List<MenuItem> loadMenuItemsFromFile(String filename) throws FileNotFoundException {
        List<MenuItem> menuItems = new ArrayList<>();//creates array list
        File file = new File(filename); //creates file object with corresponding filename
        Scanner scanner = new Scanner(file); // create scanner object to read file
        while (scanner.hasNextLine()) { //loops through each line
            String line = scanner.nextLine(); // reads lines from file
            String[] parts = line.split(","); //splits line by using commas
            if (parts.length == 6) { //checks id line has all requirements
                String itemName = parts[0].trim(); //extracts item name
                //next part takes number and converts it to a number,trim- remove whitespace, 
                double price = Double.parseDouble(parts[1].trim());//extracts price
                int calories = Integer.parseInt(parts[2].trim()); //extract calories
                int proteins = Integer.parseInt(parts[3].trim()); //extract proteins
                int fats = Integer.parseInt(parts[4].trim()); //extracts fats
                int sugar = Integer.parseInt(parts[5].trim()); // extracts sugar
                menuItems.add(new Food(itemName, price, calories, proteins, fats, sugar)); //creates food object and adds to list
            }
        }
        scanner.close(); //closes scanner object
        return menuItems; //returns the list of menu items
    
    }
}
