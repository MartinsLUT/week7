package main;

import java.util.List;

public class LibrarySystem {
    private List<Item> items;
    private FileHandler fileHandler;

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(String id) {
        for (Item item : items) {
            if (item.getId().equals(id)) {
                items.remove(item);
                System.out.println("Item removed successfully.\n");
                break;
            }
        }
        
    }

    public void listAllItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }
    
    public void searchByTitle(String title) {
        for (Item item : items) {
            if (item.getTitle().equals(title)) {
                System.out.println(item);
            }
        }
    }

    public void saveToFile(String filename) {
        fileHandler.saveItems(filename, items);
    }

    public void loadFromFile(String filename) {
        fileHandler.loadItems(filename);
    }
    
    public void displayMenu() {
        System.out.println("=== Library Management System ===");
        System.out.println("1. Add new book");
        System.out.println("2. Add new DVD");
        System.out.println("3. Remove item");
        System.out.println("4. List all items");
        System.out.println("5. Search by title");
        System.out.println("6. Save to file");
        System.out.println("7. Load from file");
        System.out.println("8. Exit");
    }
}
