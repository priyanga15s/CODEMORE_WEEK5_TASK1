import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== ArrayList Menu =====");
            System.out.println("1. Add Element");
            System.out.println("2. Remove Element");
            System.out.println("3. Search Element");
            System.out.println("4. Display Elements");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter string to add: ");
                    String addItem = sc.nextLine();
                    list.add(addItem);
                    System.out.println(addItem + " added successfully.");
                    break;

                case 2:
                    System.out.print("Enter string to remove: ");
                    String removeItem = sc.nextLine();
                    if (list.remove(removeItem)) {
                        System.out.println(removeItem + " removed successfully.");
                    } else {
                        System.out.println(removeItem + " not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter string to search: ");
                    String searchItem = sc.nextLine();
                    if (list.contains(searchItem)) {
                        System.out.println(searchItem + " is found in the list.");
                    } else {
                        System.out.println(searchItem + " is not found in the list.");
                    }
                    break;

                case 4:
                    System.out.println("Current List: " + list);
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}