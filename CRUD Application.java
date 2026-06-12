import java.util.ArrayList;
import java.util.Scanner;
class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Price: ₹" + price;
    }
}
public class CrudApplication {
    public static void main(String[] args) {
        ArrayList<Product> database = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        database.add(new Product(101, "Laptop", 45000.0));
        database.add(new Product(102, "Mobile", 15000.0));

        do {
            System.out.println("\n=== CRUD OPERATIONS MENU ===");
            System.out.println("1. CREATE (Add Product)");
            System.out.println("2. READ (View All Products)");
            System.out.println("3. UPDATE (Edit Product Price)");
            System.out.println("4. DELETE (Remove Product)");
            System.out.println("5. EXIT");
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: // CREATE
                    System.out.print("Enter Product ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Clear buffer
                    System.out.print("Enter Product Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Product Price: ");
                    double price = scanner.nextDouble();
                    
                    database.add(new Product(id, name, price));
                    System.out.println("Product added successfully!");
                    break;
                case 2: 
                    if (database.isEmpty()) {
                        System.out.println("No products found in the database.");
                    } else {
                        System.out.println("\n--- Product List ---");
                        for (Product p : database) {
                            System.out.println(p);
                        }
                    }
                    break;
                case 3: 
                    System.out.print("Enter Product ID to update: ");
                    int updateId = scanner.nextInt();
                    boolean foundUpdate = false;
                    
                    for (Product p : database) {
                        if (p.id == updateId) {
                            System.out.print("Enter New Price for " + p.name + ": ");
                            p.price = scanner.nextDouble();
                            System.out.println("Price updated successfully!");
                            foundUpdate = true;
                            break;
                        }
                    }
                    if (!foundUpdate) System.out.println("Product ID not found.");
                    break;
                case 4:
                    System.out.print("Enter Product ID to delete: ");
                    int deleteId = scanner.nextInt();
                    boolean foundDelete = false;
                    
                    for (int i = 0; i < database.size(); i++) {
                        if (database.get(i).id == deleteId) {
                            database.remove(i);
                            System.out.println("Product removed successfully!");
                            foundDelete = true;
                            break;
                        }
                    }
                    if (!foundDelete) System.out.println("Product ID not found.");
                    break;
                case 5:
                    System.out.println("Exiting application. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select between 1 and 5.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
