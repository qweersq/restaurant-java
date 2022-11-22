package admin;
//import scanner
import java.util.Scanner;

public class admin{
    // create function for add new food with parameter name, price, quantity
    public static void addNewFood(String name, int price, int quantity){
        // print out the food name, price, quantity
        System.out.println("Food name: " + name);
        System.out.println("Food price: " + price);
        System.out.println("Food quantity: " + quantity);
        // send the food name, price, quantity to app.java

    }
    //create menu for editing Food.java
    public static void main() {
        //clear screen
        // System.out.print("\033[H\033[2J");
        int choice;
        System.out.println("Welcome to Admin Page");
        System.out.println("1. Add Food");
        System.out.println("2. Edit Food");
        System.out.println("3. Delete Food");
        System.out.println("4. View Food");
        System.out.println("5. Exit");
        //create choose for user to choose
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        //create switch case for user to choose
        switch (choice) {
            case 1:
                System.out.println("Add Food");
                //create scanner for user to input food name, price, quantity
                Scanner sc1 = new Scanner(System.in);
                System.out.print("Enter food name: ");
                String name = sc1.nextLine();
                System.out.print("Enter food price: ");
                int price = sc1.nextInt();
                System.out.print("Enter food quantity: ");
                int quantity = sc1.nextInt();
                //call function addNewFood
                addNewFood(name, price, quantity);
                break;
            case 2:
                System.out.println("Edit Food");
                break;
            case 3:
                System.out.println("Delete Food");
                break;
            case 4:
                System.out.println("View Food");
                break;
            case 5:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }


    }
}
