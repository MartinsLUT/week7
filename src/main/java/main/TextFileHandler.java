package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
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
                if (item instanceof DVD) {
                    DVD dvd = (DVD) item;
                    writer.write(dvd.getId() + "," + dvd.getTitle() + "," + dvd.getDuration());
                } else {
                    Book book = (Book) item;
                    writer.write(book.getId() + "," + book.getTitle() + "," + book.getAuthor());
                }
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();   
        }
    }

    @Override
    public List<Item> loadItems(String filename) {
        //Load items from text file
        List<Item> items = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                try {
                    int id = Integer.parseInt(parts[0]);
                    String title = parts[1];
                    int duration = Integer.parseInt(parts[2]);
                    items.add(new DVD(String.valueOf(id), title, duration));
                } catch (NumberFormatException e) {
                    String id = parts[0];
                    String title = parts[1];
                    String author = parts[2];
                    items.add(new Book(id, title, author));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        return items;

    }
}
    

