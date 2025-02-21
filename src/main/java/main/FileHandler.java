package main;

import java.util.List;

public interface FileHandler {
    void saveItems(String filename, List<Item> items);
    List<Item> loadItems(String filename);
}
