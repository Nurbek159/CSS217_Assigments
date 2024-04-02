import java.util.Scanner;

public class LibraryCLI {
    private LibraryCatalog catalog;

    public LibraryCLI(LibraryCatalog catalog) {
        this.catalog = catalog;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Print Catalog");
            System.out.println("4. Quit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter item title: ");
                    String title = scanner.nextLine();
                    System.out.println("Enter item author: ");
                    String author = scanner.nextLine();

                    System.out.println("Select item type: ");
                    System.out.println("1. Book");
                    System.out.println("2. Magazine");
                    System.out.println("3. CD");
                    int itemType = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    Item item;
                    switch (itemType) {
                        case 1:
                            item = new Book(title, author);
                            break;
                        case 2:
                            item = new Magazine(title, author);
                            break;
                        case 3:
                            item = new CD(title, author);
                            break;
                        default:
                            System.out.println("Invalid item type.");
                            continue;
                    }

                    catalog.addItem(item);
                    System.out.println("Item added successfully.");
                    break;
                case 2:
                    // Remove item implementation
                    break;
                case 3:
                    // Print catalog implementation
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
