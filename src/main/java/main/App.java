package main;

import java.util.Scanner;


public class App {
    public static void main( String[] args )
    {
        App app = new App();
        app.menu();
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            LibrarySystem librarySystem = new LibrarySystem();

            librarySystem.displayMenu();
            String input = scanner.nextLine(); 
            int choice = Integer.parseInt(input);
            if (choice == 8) {
                System.out.println("Goodbye!");
                break;
            }
            switch (choice) {
                case 1:
                    // Add new book
                    System.out.println("Enter book ID: ");
                    String bookId = scanner.nextLine();
                    System.out.println("Enter book title: ");
                    String bookTitle = scanner.nextLine();
                    System.out.println("Enter book author: ");
                    String bookAuthor = scanner.nextLine();
                    Book book = new Book(bookId, bookTitle, bookAuthor);
                    librarySystem.addItem(book);
                    System.out.println("Book added successfully.\n");
                    break;
                case 2:
                    // Add new DVD
                    System.out.println("Enter DVD ID: ");
                    String dvdId = scanner.nextLine();
                    System.out.println("Enter DVD title: ");
                    String dvdTitle = scanner.nextLine();
                    System.out.println("Enter DVD duration (minutes) : ");
                    String dvdDuration = scanner.nextLine();
                    DVD dvd = new DVD(dvdId, dvdTitle, Integer.parseInt(dvdDuration));
                    librarySystem.addItem(dvd);
                    System.out.println("DVD added successfully.\n");
                    break;
                case 3:
                    // Remove item
                    System.out.println("Enter item ID to remove: ");
                    String itemId = scanner.nextLine();
                    librarySystem.removeItem(itemId);
                    break;
                case 4:
                    // List all items
                    librarySystem.listAllItems();

                    break;
                case 5:
                    // Search by title
                    System.out.println("Enter title to search: ");
                    String searchTitle = scanner.nextLine();
                    librarySystem.searchByTitle(searchTitle);
                    
                    break;
                case 6:
                    // Save to file
                    System.out.println("Enter filename to save: ");
                    String filename = scanner.nextLine();
                    librarySystem.saveToFile(filename);
                    System.out.println("Item saved to file successfully.\n");
                    break;
                case 7:
                    // Load from file
                    System.out.println("Enter filename to load: ");
                    String loadFilename = scanner.nextLine();
                    librarySystem.loadFromFile(loadFilename);   
                    System.out.println("Item loaded from file successfully\n");
                    break;
                
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
        scanner.close();
    }

}



 

        
    

