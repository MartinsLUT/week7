package main;

public abstract class Item {
    private String id;
    private String title;


    public Item(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
        

    public abstract String toString();
    
    

    
}
