package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextFileHandler implements FileHandler {



    @Override
    public void saveItems(String filename, List<Item> items) {
        //Save items to text file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Item item : items) {
                writer.write(item.toString());
                writer.newLine();
            }
            System.out.println("Items saved to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();   
        }
    }

    @Override
    public List<Item> loadItems(String filename) {
        List<Item> items = new ArrayList<Item>();
        return items;
    }
}
    

