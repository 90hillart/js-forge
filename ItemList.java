import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items = new ArrayList<>();
        String choice;

        System.out.println("=== Item List Manager ===");

        do {
            System.out.println("\nWhat would you like to do?");
            System.out.println("  1. Add an item");
            System.out.println("  2. Display all items");
            System.out.println("  3. Remove an item");
            System.out.println("  4. Quit");
            System.out.print("Enter choice: ");
            choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Enter item to add: ");
                    String newItem = scanner.nextLine().trim();
                    if (!newItem.isEmpty()) {
                        items.add(newItem);
                        System.out.println("✔ \"" + newItem + "\" added.");
                    } else {
                        System.out.println("Item cannot be empty.");
                    }
                    break;

                case "2":
                    if (items.isEmpty()) {
                        System.out.println("Your list is empty.");
                    } else {
                        System.out.println("\nYour items:");
                        for (int i = 0; i < items.size(); i++) {
                            System.out.println("  " + (i + 1) + ". " + items.get(i));
                        }
                    }
                    break;

                case "3":
                    if (items.isEmpty()) {
                        System.out.println("Your list is empty.");
                    } else {
                        System.out.println("\nYour items:");
                        for (int i = 0; i < items.size(); i++) {
                            System.out.println("  " + (i + 1) + ". " + items.get(i));
                        }
                        System.out.print("Enter the number of the item to remove: ");
                        String input = scanner.nextLine().trim();
                        try {
                            int index = Integer.parseInt(input) - 1;
                            if (index >= 0 && index < items.size()) {
                                String removed = items.remove(index);
                                System.out.println("✔ \"" + removed + "\" removed.");
                            } else {
                                System.out.println("Invalid number.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Please enter a valid number.");
                        }
                    }
                    break;

                case "4":
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, 3, or 4.");
            }

        } while (!choice.equals("4"));

        scanner.close();
    }
}
