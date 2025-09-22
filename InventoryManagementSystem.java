import java.util.ArrayList;
import java.util.Scanner;
 class Item {



        private int id;
        private String name;
        private double price;
        private String category;

        public Item(int id, String name, double price, String category) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.category = category;
        }

        public int getId() {
            return id;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Name: " + name + ", Price: $" + price + ", Category: " + category;
        }
    }

    public class InventoryManagementSystem {
        public static void main(String[] args) {
            ArrayList<Item> inventory = new ArrayList<>();
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("\n=== Inventory Management System ===");
                System.out.println("1. Add Item");
                System.out.println("2. Print All Items");
                System.out.println("3. Find Most Expensive Item");
                System.out.println("4. Remove Item by ID");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Item ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Item Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Price: ");
                        double price = sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Enter Category: ");
                        String category = sc.nextLine();

                        inventory.add(new Item(id, name, price, category));
                        System.out.println("Item added successfully!");
                        break;

                    case 2:
                        if (inventory.isEmpty()) {
                            System.out.println("Inventory is empty.");
                        } else {
                            System.out.println("\n--- Inventory List ---");
                            for (Item item : inventory) {
                                System.out.println(item);
                            }
                        }
                        break;

                    case 3:
                        if (inventory.isEmpty()) {
                            System.out.println("No items available.");
                        } else {
                            Item maxItem = inventory.get(0);
                            for (Item item : inventory) {
                                if (item.getPrice() > maxItem.getPrice()) {
                                    maxItem = item;
                                }
                            }
                            System.out.println("Most Expensive Item: " + maxItem);
                        }
                        break;

                    case 4:
                        System.out.print("Enter Item ID to remove: ");
                        int removeId = sc.nextInt();
                        boolean removed = inventory.removeIf(item -> item.getId() == removeId);
                        if (removed) {
                            System.out.println("Item removed successfully.");
                        } else {
                            System.out.println("Item not found.");
                        }
                        break;

                    case 5:
                        System.out.println("Exiting... Goodbye!");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid option! Please try again.");
                }
            }
        }
    }

